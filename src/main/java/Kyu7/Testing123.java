package Kyu7;

import java.util.ArrayList;
import java.util.List;

/**
 * Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
 *
 * Write a function which takes a list of strings and returns each line prepended by the correct number.
 *
 * The numbering starts at 1. The format is n: string. Notice the colon and space in between.
 */

public class Testing123 {
    public static List<String> number(List<String> lines) {
        List<String> numberedList = new ArrayList<String>();
        int count = 1;

        for (String text : lines) {
            numberedList.add(count + ": " + text);
            count++;
        }
        return numberedList;
    }
}
