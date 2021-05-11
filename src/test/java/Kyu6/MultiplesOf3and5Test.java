package Kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplesOf3and5Test {
    @Test
    public void test() {
        assertEquals(23, new MultiplesOf3and5().solution(10));
    }
}
