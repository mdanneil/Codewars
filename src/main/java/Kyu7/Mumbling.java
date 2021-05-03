package Kyu7;

/**
 * This time no story, no theory. The examples below show you how to write function accum:
 *
 * Examples:
 *
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
 *
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 */

public class Mumbling {
    public static String accum(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char[] stringToChars = s.toCharArray();

        for (char charAtIndex : stringToChars) {
            for (int i = 0; i < count; i++) {
                if (i < 1) {
                    sb.append(Character.toUpperCase(charAtIndex));
                }
                else {
                    sb.append(Character.toLowerCase(charAtIndex));
                }
            }
            sb.append('-');
            count++;
        }
        return sb.substring(0, sb.length()-1);
    }
}
