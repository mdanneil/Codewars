package Kyu8.SumOfNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfNumbersTest {
    Kyu8.SumOfNumbers.Sum s = new Kyu8.SumOfNumbers.Sum();

    @Test
    public void Test1()
    {
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
    }
}
