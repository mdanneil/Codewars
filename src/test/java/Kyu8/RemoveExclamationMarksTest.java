package Kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class RemoveExclamationMarksTest {
    @Test
    public void testSimpleString1() {
        assertEquals("Hello World", RemoveExclamationMarks.removeExclamationMarks("Hello World!"));
    }

    @Test
    public void testSimpleString2() {
        assertEquals("Hello World", RemoveExclamationMarks.removeExclamationMarks("!Hello! World!"));
    }
}
