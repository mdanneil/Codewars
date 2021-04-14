package ReversedStrings;

/**
 * Complete the solution so that it reverses the string passed into it.
 */

public class ReversedStrings {

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
