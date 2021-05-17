package Kyu8;

import java.util.Arrays;
import java.util.Collections;

public class ReversedWords {
    public static String reverseWords(String str){
        String[] strArray = str.split(" ");
        Collections.reverse(Arrays.asList(strArray));
        StringBuilder sb = new StringBuilder();

        for (String word : strArray) {
            sb.append(word + " ");
        }

        return sb.toString().trim();
    }
}
