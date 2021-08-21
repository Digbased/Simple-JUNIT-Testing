public class KevinPham {

    private static String first = "Kevin";
    private static String last = "Pham";
    private static String fullName = "Kevin Pham";
    private static String UCInet = "kevinhp2";
    private static int ID = 32907444;

    public static String getFullName() {
        return fullName;
    }

    public static String getFirstName() {
        return first;
    }

    public static String getLastName() {
        return last;
    }

    public static String getUCInetID() {
        return UCInet;
    }

    public static int getStudentNumber() {
        return ID;
    }

    public static String getRotatedFullName(int shift) {

        String result = null;

        if (shift > 0) // left rotate
        {
            result = fullName.substring(shift, fullName.length()) + fullName.substring(0, shift);
        }

        if (shift < 0) // right rotate
        {
            result = fullName.substring(fullName.length() + shift, fullName.length()) + fullName.substring(0, fullName.length() + shift);
        }

        return result;
    }
}
