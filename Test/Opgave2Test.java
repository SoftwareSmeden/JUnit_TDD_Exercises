import org.junit.Test;

import static org.junit.Assert.*;

public class Opgave2Test {

    @Test
    public void findLowestNumbOf2() {
        Opgave2 opgave2 = new Opgave2();
        assertEquals(4,opgave2.findLowestNumbOf2(4,8));
    }

    @Test
    public void findHighestNumbOf2() {
        Opgave2 opgave2 = new Opgave2();
        assertEquals(8,opgave2.findHighestNumbOf2(4,8));
    }

    @Test
    public void findLowestNumbOf3() {
        Opgave2 opgave2 = new Opgave2();
        assertEquals(1,opgave2.findLowestNumbOf3(4,8,1));
        assertEquals(4,opgave2.findLowestNumbOf3(4,8,5));
        assertEquals(2,opgave2.findLowestNumbOf3(4,2,3));
    }

    @Test
    public void findLowestValueInTheArray() {
        Opgave2 opgave2 = new Opgave2();
        assertEquals(1,opgave2.findLowestValueInTheArray(new int[]{1, 5, 2, 3, 4},5));
    }

    @Test
    public void findHighestValueInTheArray() {
        Opgave2 opgave2 = new Opgave2();
        assertEquals(5,opgave2.findHighestValueInTheArray(new int[]{1, 5, 2, 3, 4}));
    }

    @Test
    public void findSumOfTheArray() {
        Opgave2 opgave2 = new Opgave2();
        assertEquals(15,opgave2.findSumOfTheArray(new int[]{1, 5, 2, 3, 4}));
    }

    @Test
    public void findAvgOfTheArray() {
        Opgave2 opgave2 = new Opgave2();
        assertEquals(3.0,opgave2.findAvgOfTheArray(new int[]{1, 5, 2, 3, 4}),3.0);
    }
}