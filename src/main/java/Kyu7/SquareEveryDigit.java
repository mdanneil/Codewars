package Kyu7;

/**
 * Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
 *
 * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
 *
 * Note: The function accepts an integer and returns an integer
 */

public class SquareEveryDigit {
    public int squareDigits(int n) {
        String numToString = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numToString.length(); i++) {
            int intSquared = (Character.getNumericValue(numToString.charAt(i)) * (Character.getNumericValue(numToString.charAt(i))));
            sb.append(intSquared);
        }
        return Integer.parseInt(String.valueOf(sb));
    }
}
