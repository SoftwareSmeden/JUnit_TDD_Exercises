import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Opg. 1
        Opgave1 opgave1 = new Opgave1();
        System.out.println(opgave1.f(4));
        System.out.println(opgave1.udskriv(4,"ja"));

        //Opg. 2
        Opgave2 opgave2 = new Opgave2();
        int[] arr = {1,4,2,5,3};
        int arrLength = 5;
        System.out.println(opgave2.findLowestNumbOf2(4,2));
        System.out.println(opgave2.findHighestNumbOf2(6,2));
        System.out.println(opgave2.findLowestNumbOf3(2,6,1));
        System.out.println(opgave2.findLowestValueInTheArray(arr,arrLength));
        System.out.println(opgave2.findHighestValueInTheArray(arr));
        System.out.println(opgave2.findSumOfTheArray(arr));
        System.out.println(opgave2.findAvgOfTheArray(arr));

        //Opg. Sphere
        DelOpgave delOpgave = new DelOpgave();
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nEnter a radius: ");
        double userRadius = userInput.nextDouble();
        System.out.println("Volume: "+delOpgave.calcVolumeOfASphere(userRadius));

        //Opg. Dollars-and-cents
        System.out.println("Enter dollar amount: ");
        double userDollars = userInput.nextDouble();
        System.out.println("Dollars with taxes added: "+delOpgave.addTaxes(userDollars)+"$");

        //Opg. Polynomial
        System.out.println("Enter the value for X: ");
        double userX = userInput.nextDouble();
        System.out.println("Result is: "+delOpgave.polynomial(userX));

        //Opg. Modify Polynomial
        System.out.println("Enter the value for X2: ");
        double userX2 = userInput.nextDouble();
        System.out.println("Result is: "+delOpgave.polynomial2(userX2));

        //Opg. U.S dollar amount
        System.out.println("Enter dollar amount: ");
        int userDollars2 = userInput.nextInt();
        int[] arrBills = delOpgave.dollarBills(userDollars2);
        System.out.printf("%-10s %d \n","Twenties:", arrBills[0]);
        System.out.printf("%-10s %d \n","Tens:", arrBills[1]);
        System.out.printf("%-10s %d \n","Fives:", arrBills[2]);
        System.out.printf("%-10s %d \n","Ones:", arrBills[3]);

        //Opg. count digits
        System.out.println("Enter a digit and count it: ");
        int countDigits = userInput.nextInt();
        System.out.println("Amount of digits: "+delOpgave.countDigits(countDigits).length());

        //Opg. find largest and smallest number
        System.out.println("Enter four integers and lets find the largest and smallest: ");
        System.out.print("1: ");
        int firstInt = userInput.nextInt();
        System.out.print("2: ");
        int secondInt = userInput.nextInt();
        System.out.print("3: ");
        int thirdInt = userInput.nextInt();
        System.out.print("4: ");
        int fourthInt = userInput.nextInt();
        int[] largestAndSmallestInt = delOpgave.findTheLargestAndSmallestInteger(firstInt,secondInt,thirdInt,fourthInt,4);
        System.out.println("Largest integer: "+largestAndSmallestInt[0]);
        System.out.println("Smallest integer: "+largestAndSmallestInt[1]);

        //Opg. find the earliest date
        System.out.println("Enter two dates and lets find the earliest date: ");
        System.out.println("First date");
        System.out.print("Day: ");
        int firstDay = userInput.nextInt();
        System.out.print("Month: ");
        int firstMonth = userInput.nextInt();
        System.out.print("Year: ");
        int firstYear = userInput.nextInt();
        System.out.println("\nSecond date");
        System.out.print("Day: ");
        int secondDay = userInput.nextInt();
        System.out.print("Month: ");
        int secondMonth = userInput.nextInt();
        System.out.print("Year: ");
        int secondYear = userInput.nextInt();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1 = LocalDate.of(firstYear,firstMonth,firstDay);
        LocalDate date2 = LocalDate.of(secondYear,secondMonth,secondDay);
        System.out.println(delOpgave.returnEarliestDate(date1,date2).format(dateFormat));

        //Opg. convert grade to a letter
        System.out.println("\nEnter grade: ");
        String grade = delOpgave.convertGradeToLetter(userInput.nextInt());
        System.out.println(grade);

        //Opg. day of year
        System.out.println("Enter a date and lets find the number of the day: ");
        System.out.print("Day: ");
        int day = userInput.nextInt();
        System.out.print("Month: ");
        int month = userInput.nextInt();
        System.out.print("Year: ");
        int year = userInput.nextInt();
        System.out.println("Day number: "+ delOpgave.dayOfYear(month,day,year));
    }
}
