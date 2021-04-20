package Kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfNumbersTest {
    @Test
    public void Test1()
    {
        assertEquals(-1, SumOfNumbers.GetSum(0, -1));
        assertEquals(1, SumOfNumbers.GetSum(0, 1));
    }
}
