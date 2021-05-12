package Kyu8;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class NonConsecutiveNumbersTest {
    @Test public void basicTests() {
        assertEquals(Integer.valueOf(6), NonConsecutiveNumbers.find(new int[]{1, 2, 3, 4, 6, 7, 8}));
        assertEquals(null, NonConsecutiveNumbers.find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        assertEquals(Integer.valueOf(6), NonConsecutiveNumbers.find(new int[]{4, 6, 7, 8, 9, 11}));
        assertEquals(Integer.valueOf(11), NonConsecutiveNumbers.find(new int[]{4, 5, 6, 7, 8, 9, 11}));
        assertEquals(null, NonConsecutiveNumbers.find(new int[]{31, 32}));
        assertEquals(Integer.valueOf(0), NonConsecutiveNumbers.find(new int[]{-3, -2, 0, 1}));
        assertEquals(Integer.valueOf(-1), NonConsecutiveNumbers.find(new int[]{-5, -4, -3, -1}));
    }
}
