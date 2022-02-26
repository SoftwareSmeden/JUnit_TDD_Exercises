import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Date;

public class DelOpgave {

    //Opg. 1
    /**
     *
     * @param digits
     * @return string
     */
    public String countDigits(int digits){
        String s = Integer.toString(digits);
        return s;
    }

    //Opg. 2/3
    /**
     *
     * @param radius
     * @return volume
     */
    public double calcVolumeOfASphere(double radius){
        return 4.0/3.0 * Math.PI * Math.pow(radius,3);
    }

    //Opg. 4
    /**
     *
     * @param dollars
     * @return dollars
     */
    public double addTaxes(double dollars){
        return dollars*1.05;
    }

    //Opg. 5
    /**
     *
     * @param x
     * @return polynomial
     */
    public double polynomial(double x){
        return (3*Math.pow(x,5) + 2*Math.pow(x,4) - 5*Math.pow(x,3) - Math.pow(x,2) + 7*x - 6);
    }

    //Opg. 6
    /**
     *
     * @param x
     * @return polynomial2
     */
    public double polynomial2(double x){
        return (((((3*x+2)*x-5)*x-1)*x+7)*x-6);
    }

    //Opg. 7
    /**
     *
     * @param dollars
     * @return arrBills
     */
    public int[] dollarBills(int dollars){
        int twenties = dollars/20;
        int modulus = dollars%20;
        int tens = modulus/10;
        modulus = modulus%10;
        int fives = modulus/5;
        modulus = modulus%5;
        int ones = modulus;
        int[] arrBills = new int[4];
        arrBills[0] = twenties;
        arrBills[1] = tens;
        arrBills[2] = fives;
        arrBills[3] = ones;
        return arrBills;
    }

    //Opg. 7 Find the largest and smallest integer
    /**
     *
     * @param a
     * @param b
     * @param c
     * @param d
     * @param arrLength
     * @return largestAndSmallest
     */
    public int[] findTheLargestAndSmallestInteger(int a, int b, int c, int d,int arrLength){
        int[] fourIntegers = {a,b,c,d};
        int[] largestAndSmallest = {fourIntegers[0],fourIntegers[0]};
        for (int i = 0; i < arrLength; i++) {
           if (fourIntegers[i] > largestAndSmallest[0]) largestAndSmallest[0] = fourIntegers[i];
           if (fourIntegers[i] < largestAndSmallest[1]) largestAndSmallest[1] = fourIntegers[i];
        }
        return largestAndSmallest;
    }

    //Opg. 9
    /**
     *
     * @param date1
     * @param date2
     * @return date
     */
    public LocalDate returnEarliestDate(LocalDate date1, LocalDate date2){
        if (date1.isBefore(date2)) return date1;
        else return date2;
    }

    //Opg. 10
    /**
     *
     * @param grade
     * @return letter
     */
    public String convertGradeToLetter(int grade){
        if (grade >= 90 && grade <= 100) return "A";
        if (grade >= 80 && grade <= 89) return "B";
        if (grade >= 70 && grade <= 79) return "C";
        if (grade >= 60 && grade <= 69) return "D";
        return "F";
    }

    //Opg. 4 day_of_year
    /**
     *
     * @param month
     * @param day
     * @param year
     * @return day
     */
    public int dayOfYear(int month, int day, int year){
        int[] daysPerMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (year%4 == 0) daysPerMonth[1] = 29;
        for (int i = 0; i < month-1; i++) {
            day += daysPerMonth[i];
        }
        return day;
    }
}
