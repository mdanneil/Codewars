package Kyu6;

/**
 * Given an array of integers, find the one that appears an odd number of times.
 *
 * There will always be only one integer that appears an odd number of times.
 */

public class FindTheOddInt {
    public static int findIt(int[] a) {

        for (int i = 0; i < a.length; i++) {

            int currentNum = a[i];
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == currentNum) {
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
