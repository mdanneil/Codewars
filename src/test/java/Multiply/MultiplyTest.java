package Multiply;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyTest {

    Multiply multiply = new Multiply();

    @Test
    public void testSomething() {
        assertEquals(6, multiply.multiply(2.0, 3.0));
    }
}
