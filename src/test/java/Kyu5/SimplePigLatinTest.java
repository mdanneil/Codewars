package Kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class SimplePigLatinTest {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", SimplePigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", SimplePigLatin.pigIt("This is my string"));
    }
}
