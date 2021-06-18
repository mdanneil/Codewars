package Kyu8;

import java.util.Arrays;

/**
 * You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.
 *
 * Array can contain numbers or strings. X can be either.
 *
 * Return true if the array contains the value, false if not.
 */

public class YouOnlyNeedOne {

    public static boolean check(Object[] a, Object x) {
        for (Object obj : a) {
            if (obj == x) {
                return true;
            }
        }
        return false;
    }
}
