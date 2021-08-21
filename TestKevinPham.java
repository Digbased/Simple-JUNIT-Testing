import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestKevinPham {
    @Test
    public void getFullName()
    {
        assertEquals("Kevin Pham", KevinPham.getFullName(), "Name must be matching");
    }

    @Test
    public void getFirstName()
    {
        assertEquals("Kevin", KevinPham.getFirstName(),"First name not matching");
    }

    @Test
    public void getLastName()
    {
        assertEquals("Pham", KevinPham.getLastName(), "Last name not matching");
    }

    @Test
    public void getID()
    {
        assertEquals("kevinhp2", KevinPham.getUCInetID(), "ID Not matching");
    }

    @Test
    public void getSTUIDNUM()
    {
        assertTrue(KevinPham.getStudentNumber() == 32907444);
    }

    @Test
    public void rotateLeft()
    {
        assertEquals("vin PhamKe", KevinPham.getRotatedFullName(2), "Left Shift is not matching");
    }

    @Test
    public void rotateRight()
    {
        assertEquals("hamKevin P", KevinPham.getRotatedFullName(-3), "Right Shift is not matching");
    }
}
