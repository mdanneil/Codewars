package Kyu8;

public class AbbreviateATwoWordName {
    public static String abbrevName(String name) {
        String[] strArray = name.split(" ");
        return strArray[0].substring(0, 1).toUpperCase() + "." + strArray[1].substring(0, 1).toUpperCase();
    }
}
