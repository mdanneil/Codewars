package Kyu8;

import java.util.Arrays;

public class SmallestInteger {
    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().getAsInt();
    }
}
