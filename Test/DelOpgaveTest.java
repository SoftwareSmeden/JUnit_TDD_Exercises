import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class DelOpgaveTest {

    @Test
    public void calcVolumeOfASphere() {
        DelOpgave delOpgave = new DelOpgave();
        assertEquals(33.5103, delOpgave.calcVolumeOfASphere(2),33.5103);
    }

    @Test
    public void addTaxes() {
        DelOpgave delOpgave = new DelOpgave();
        assertEquals(105, delOpgave.addTaxes(100),105);
    }

    @Test
    public void countDigits() {
        DelOpgave delOpgave = new DelOpgave();
        assertEquals("123", delOpgave.countDigits(123));
    }

    @Test
    public void polynomial() {
        DelOpgave delOpgave = new DelOpgave();
        assertEquals(0, delOpgave.polynomial(1),0);
        assertEquals(-6, delOpgave.polynomial(0),-6);
    }

    @Test
    public void polynomial2() {
        DelOpgave delOpgave = new DelOpgave();
        assertEquals(52, delOpgave.polynomial2(2), 52);
    }

    @Test
    public void dollarBills() {
        DelOpgave delOpgave = new DelOpgave();
        assertArrayEquals(new int[]{4,1,0,3}, delOpgave.dollarBills(93));
    }

    @Test
    public void findTheLargestAndSmallestInteger() {
        DelOpgave delOpgave = new DelOpgave();
        assertArrayEquals(new int[]{9,1}, delOpgave.findTheLargestAndSmallestInteger(9,1,2,2,4));
    }

    @Test
    public void returnEarliestDate() {
        DelOpgave delOpgave = new DelOpgave();
        LocalDate date1 = LocalDate.of(2000,7,22);
        LocalDate date2 = LocalDate.of(1992,5,29);
        assertEquals(date2, delOpgave.returnEarliestDate(date1,date2));
    }

    @Test
    public void convertGradeToLetter() {
        DelOpgave delOpgave = new DelOpgave();
        assertEquals("A", delOpgave.convertGradeToLetter(95));
        assertEquals("B", delOpgave.convertGradeToLetter(85));
        assertEquals("C", delOpgave.convertGradeToLetter(75));
        assertEquals("D", delOpgave.convertGradeToLetter(65));
        assertEquals("F", delOpgave.convertGradeToLetter(22));
    }

    @Test
    public void dayOfYear() {
        DelOpgave delOpgave = new DelOpgave();
        assertEquals(201, delOpgave.dayOfYear(7,19,2016));
        assertEquals(200, delOpgave.dayOfYear(7,19,2015));
    }
}