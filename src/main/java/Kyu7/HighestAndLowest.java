package Kyu7;

import java.util.ArrayList;

/**
 * In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
 *
 * Example:
 *
 * highAndLow("1 2 3 4 5")  // return "5 1"
 * highAndLow("1 2 -3 4 5") // return "5 -3"
 * highAndLow("1 9 3 4 -5") // return "9 -5"
 *
 * Notes:
 *
 *     All numbers are valid Int32, no need to validate them.
 *     There will always be at least one number in the input string.
 *     Output string must be two numbers separated by a single space, and highest number is first.
 */

public class HighestAndLowest {
    public static String highAndLow(String numbers) {

        String[] listOfString = numbers.split(" ");
        int lowest = Integer.parseInt(listOfString[0]);
        int highest = Integer.parseInt(listOfString[0]);

        for (String num : listOfString) {
            if (Integer.parseInt(num) < lowest) {
                lowest = Integer.parseInt(num);
            }
            if (Integer.parseInt(num) > highest) {
                highest = Integer.parseInt(num);
            }
        }
        return highest + " " + lowest;
    }
}
