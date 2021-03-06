package Kyu8;

/**
 * Your function takes two arguments:
 *
 *     current father's age (years)
 *     current age of his son (years)
 *
 * Сalculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old).
 */

public class TwiceAsOld {
    public static int TwiceAsOld(int dadYears, int sonYears){

        int difference = dadYears - sonYears * 2;

        if (difference < 0) {
            return difference * -1;
        }
        return difference;
    }
}
