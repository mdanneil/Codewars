package Kyu8;

/**
 * Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
 * Example:
 * 348597 => [7,9,5,8,4,3]
 */

public class ConvertNumbersToArray {
    public static int[] digitize(long n) {
        String s = Long.toString(n);
        int[] intArray = new int[s.length()];
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            intArray[count] = s.charAt(i) - '0';
            count++;
        }

        return intArray;
    }
}
