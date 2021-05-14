package Kyu8;

/**
 * You get an array of numbers, return the sum of all of the positives ones.
 * <p>
 * Example [1,-4,7,12] => 1 + 7 + 12 = 20
 * <p>
 * Note: if there is nothing to sum, the sum is default to 0.
 */

public class SumOfPositive {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num > 0) {
                sum += num;
            }
        }
        return arr.length > 0 ? sum : 0;
    }
}
