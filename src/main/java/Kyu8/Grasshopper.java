package Kyu8;

public class Grasshopper {
    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
}
