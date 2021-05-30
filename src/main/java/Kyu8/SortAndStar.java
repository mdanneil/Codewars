package Kyu8;

import java.util.Arrays;

/**
 * You will be given a vector of strings. You must sort it alphabetically (case-sensitive, and based on the ASCII values of the chars) and then return the first value.
 *
 * The returned value must be a string, and have "***" between each of its letters.
 *
 * You should not remove or add elements from/to the array.
 */

public class SortAndStar {
    public static String twoSort(String[] s) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(s);
        char[] wordArray = s[0].toCharArray();
        for (char c : wordArray) {
            sb.append(c + "***");
        }
        return sb.substring(0, sb.length() - 3);
    }
}
