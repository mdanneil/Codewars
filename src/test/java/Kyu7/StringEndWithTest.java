package Kyu7;

import Kyu8.StringEndWith;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringEndWithTest {
    @Test
    public void testSomething() {
        assertEquals(true, StringEndWith.solution("abc", "bc"));
        assertEquals(true, StringEndWith.solution("scratch", "tch"));
        assertEquals(false, StringEndWith.solution("bird", "r"));
        assertEquals(true, StringEndWith.solution("test", "est"));
    }
}
