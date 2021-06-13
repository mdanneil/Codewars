package Kyu7;

import java.util.Arrays;

/**
 * Given a sequence of numbers, find the largest pair sum in the sequence.
 *
 * For example
 *
 * [10, 14, 2, 23, 19] -->  42 (= 23 + 19)
 * [99, 2, 2, 23, 19]  --> 122 (= 99 + 23)
 *
 * Input sequence contains minimum two elements and every element is an integer.
 */

public class LargestPairSumInArray {

    public static int largestPairSum(int[] numbers){
        Arrays.sort(numbers);
        int sum = 0;
        for (int i = 1; i < 3; i++) {
            sum += numbers[numbers.length-i];
        }
        return sum;
    }

}
