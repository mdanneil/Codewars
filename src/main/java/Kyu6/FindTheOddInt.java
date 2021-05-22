package Kyu6;

/**
 * Given an array of integers, find the one that appears an odd number of times.
 *
 * There will always be only one integer that appears an odd number of times.
 */

public class FindTheOddInt {
    public static int findIt(int[] a) {

        for (int currentNum : a) {

            int count = 0;
            for (int i : a) {
                if (i == currentNum) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return currentNum;
            }
        }
        return 0;
    }
}
