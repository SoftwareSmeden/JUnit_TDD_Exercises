import java.util.Arrays;

public class Opgave2 {

    /**
     *
     * @param a
     * @param b
     * @return a or b
     */
    public int findLowestNumbOf2(int a, int b){
        if (a < b){
            return a;
        }else
            return b;
    }

    /**
     *
     * @param c
     * @param d
     * @return c or d
     */
    public int findHighestNumbOf2(int c, int d){
        if (c > d){
            return c;
        }else
            return d;
    }

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return a or b or c
     */
    public int findLowestNumbOf3(int a, int b, int c){
        if (a < b){
            if (a < c)
                return a;
        }else if (b < a) {
            if (b < c)
                return b;
        }
        return c;
    }

    /**
     *
     * @param arr
     * @return lowestNumb
     */
    public int findLowestValueInTheArray(int[] arr, int antal){
        int lowestNumb = arr[0];
        for (int i = 1; i < antal; i++) {
            if (arr[i] < lowestNumb){
                lowestNumb = arr[i];
            }
        }
        return lowestNumb;
    }

    /**
     *
     * @param arr
     * @return highestNumb
     */
    public int findHighestValueInTheArray(int[] arr){
        int highestNumb = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highestNumb){
                highestNumb = arr[i];
            }
        }
        return highestNumb;
    }

    /**
     *
     * @param arr
     * @return sum
     */
    public int findSumOfTheArray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     *
     * @param arr
     * @return avg of the array
     */
    public double findAvgOfTheArray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double)sum/arr.length;
    }
}
