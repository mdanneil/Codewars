package Kyu8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversedStringsTest {

    @Test
    public void sampleTests() {
        Assertions.assertEquals("dlrow", ReversedStrings.solution("world"));
    }
}
