package Kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MakeUpperCaseTest {
    MakeUpperCase u = new MakeUpperCase();

    @Test
    public void testSomething() {
        assertEquals("HELLO",u.MakeUpperCase("hello"));
    }
}
