# Software-Testing
File: Simple JUNIT Testing - Testing methods with JUNIT assert statements to check valid inputs, invalid inputs, and edge cases.

File: Structural and Functional Testing - Testing methods with JUNIT assert statements to run functional and structural tests while accessing its coverage. 
  - Not  all  of  the  program  would  have  100%  full  structural  coverage,  even  with  an  elaborate functional test suite.
  - Added edge cases, boundaries to continue coverage.

File: Finding bugs in real world projects - Using Defects4J, I looked into a buggy file and denoted my findings. I compared the outputs and differences of where faults occur, warnings, and by writing test cases.
  -Differences of the source code:
        Line 958
        Buggy: res[i] = diff * x[i] + boundaries[0][i];	
        Fixed: res[i] = diff * x[i];


        Buggy Line 991-1000:
        for (int i = 0; i < x.length; i++) {	
        if (x[i] < 0) {	
        return false;	
        }	
        if (x[i] > 1.0) {	
        return false;	
        }	
        }	
        return true;

        Fixed 991-1000:
        final double[] bLoEnc = encode(boundaries[0]);
        final double[] bHiEnc = encode(boundaries[1]);
        for (int i = 0; i < x.length; i++) {
        if (x[i] < bLoEnc[i]) {
        return false;
        }
        if (x[i] > bHiEnc[i]) {
        return false;
        }
        }
        return true;


        Intuition:
        From hindsight, when running Defects4J, we were able to find that it wasn't compiling at line 82, 134, 195. 

        Summary for Bug: Math-18
        Cannot compile sources! at /users/kevinpham/defects4j/framework/bin/d4j/d4j-compile line 82.
        Compilation failed in require at /users/kevinpham/defects4j/framework/bin/defects4j line 195.

        Cannot compile test suite! at /users/kevinpham/defects4j/framework/bin/d4j/d4j-test line 134.
        Compilation failed in require at /users/kevinpham/defects4j/framework/bin/defects4j line 195.

        In actuality, those lines were not the problem. After some scanning and finding differences, I was able to pull up the differences in the         line codes
        that were changed from the buggy and fixed versions seen above. The math seemed off, and which is why the boundaries in the float were
        not stored correctly, making the resulting return output for that function, "buggy". In terms of comparing the CSV files,
        it is noticed that the buggy and fixed version both have the same "bugs." When talking to other testers, we noticed a similar
        repetition that they also received the same outputs in the csv for buggy and fixed. The code will run just fine with the
        bugs in the csv and the fixed, they are just minimizing an if statement, combining them for less memory use and possibly
        reducing run time. These were found on line 428, 436, and 568. Based on this analysis of the csv file, it is just up to the developer
        to make the code more efficient.

        In regards to the likelihood of finding the fault, it is much easier to find than scanning through line by line and running
        a compiler to find the bugs. Really knowing the assert statements can cause human error, where as running defects and such tools,
        can reduced the issues and have a more accurate analysis. We can see where the bugs and warnings are shown, handle them, then run
        assert and test cases to check the accuracy. Based on my findings, I defer that the bugs have been fixed, and that the csv
        out put shown, will not cause any problems in regards to incorrect output. 
