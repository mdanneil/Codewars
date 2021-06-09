package Kyu7;

/**
 * Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
 * Examples:
 *
 * Input: 42145 Output: 54421
 *
 * Input: 145263 Output: 654321
 *
 * Input: 123456789 Output: 987654321
 */

public class DescendingOrder {
    public static int sortDesc(final int num) {

        if (num<0) return num;
        int descendingNum = 0;

        for (int i = 9; i >= 0; i--) {
            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit == i) {
                    descendingNum *= 10;
                    descendingNum += digit;
                }
                temp /= 10;
            }
        }
        return num < 0 ? num : descendingNum;
    }
}
