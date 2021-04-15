package Kyu7;

/**
 * Given a string made up of letters a, b, and/or c, switch the position of letters a and b (change a to b and vice versa). Leave any incidence of c untouched.
 *
 * Example:
 *
 * 'acb' --> 'bca'
 * 'aabacbaa' --> 'bbabcabb'
 */

public class Switch {
    public static String switcheroo(String x) {

        char[] charArray = x.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a') charArray[i] = 'b';
            else if (charArray[i] == 'b') charArray[i] = 'a';
        }

        return String.valueOf(charArray);
    }
}
