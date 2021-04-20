package Kyu8;

public class SumOfNumbers {
    public static int GetSum(int a, int b) {

        int sum = 0;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }

        return a == b ? a : sum;
    }
}
