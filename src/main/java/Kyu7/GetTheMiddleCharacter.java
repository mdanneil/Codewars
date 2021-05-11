package Kyu7;

public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        int midIndex = word.length() / 2;
        return word.length() % 2 == 0 ? word.substring(midIndex-1, midIndex+1) : word.substring(midIndex, midIndex+1);
    }
}
