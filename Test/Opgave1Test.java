import org.junit.Test;
import static org.junit.Assert.*;

public class Opgave1Test {

    @Test
    public void below7() {
        Opgave1 opg1 = new Opgave1();
        assertEquals(1,opg1.f(5));
    }
    @Test
    public void below9() {
        Opgave1 opg1 = new Opgave1();
        assertEquals(2,opg1.f(8));
    }
    @Test
    public void below13() {
        Opgave1 opg1 = new Opgave1();
        assertEquals(3,opg1.f(11));
    }
    @Test
    public void above12() {
        Opgave1 opg1 = new Opgave1();
        assertEquals(4,opg1.f(25));
    }

    @Test
    public void udskrivBelow100AndJa() {
        Opgave1 opg1 = new Opgave1();
        assertEquals("Godkendt 1", opg1.udskriv(55,"ja"));
    }
    @Test
    public void udskrivAbove100AndJa() {
        Opgave1 opg1 = new Opgave1();
        assertEquals("Godkendt 2", opg1.udskriv(120,"ja"));
    }
    @Test
    public void udskrivBelow100AndNo() {
        Opgave1 opg1 = new Opgave1();
        assertEquals("Godkendt 4", opg1.udskriv(55,"nej"));
    }
    @Test
    public void udskrivAbove100AndNej() {
        Opgave1 opg1 = new Opgave1();
        assertEquals("Godkendt 5", opg1.udskriv(155,"nej"));
    }
    @Test
    public void udskrivEquals100() {
        Opgave1 opg1 = new Opgave1();
        assertEquals("Godkendt", opg1.udskriv(100,""));
    }
}