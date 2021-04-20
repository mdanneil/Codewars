package Kyu8;


/**
 * Write a function called repeatStr which repeats the given string string exactly n times.
 */
public class StringRepeat {
    public static String repeatStr(int i, String a) {
        StringBuilder sb = new StringBuilder(a);
        for (int j = 1; j < i; j++) {
            sb.append(a);
        }
        if (i < 1) {
            return "";
        }
        return sb.toString();
    }
}
