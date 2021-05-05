package Kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertBooleanToStringTest {
    @Test
    public void testBoolToWord() {
        assertEquals(ConvertBooleanToString.boolToWord(true),"Yes");
        assertEquals(ConvertBooleanToString.boolToWord(false),"No");
    }
}
