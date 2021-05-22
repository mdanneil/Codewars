package Kyu5;

/**
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
 */

public class SimplePigLatin {
    public static String pigIt(String str) {
        String[] strArray = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : strArray) {
            if (word.contains("!@#$%&*()'+,-./:;<=>?[]^_`{|}")) {
                sb.append(word);
            }
            word = word.substring(1) + word.charAt(0) + "ay ";
            sb.append(word);
        }
        return sb.toString().trim();
    }
}
