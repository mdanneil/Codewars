package Kyu8;

/**
 * Complete the solution so that it reverses the string passed into it.
 */

public class ReversedStrings {

    public static String solution(String str) {
        StringBuilder sbb = new StringBuilder(str);
        return sbb.reverse().toString();
    }
}
