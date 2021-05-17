package Kyu7;

/**
 * You will be given an `array` and a `limit` value.
 * You must check that all values in the array are below or equal to the limit value.
 * If they are, return `1`. Else, return `0`.
 */

public class SmallEnough {
    public static boolean smallEnough(int[] a, int limit) {
        for (int num : a) {
            if (num > limit) {
                return false;
            }
        }
        return true;
    }
}
