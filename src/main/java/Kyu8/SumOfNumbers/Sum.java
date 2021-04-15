package Kyu8.SumOfNumbers;

public class Sum {
    public int GetSum(int a, int b) {

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
