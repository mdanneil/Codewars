package Kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrasshopperTest {
    @Test
    public void basicTests() {
        assertEquals("Hello boss", Grasshopper.greet("Daniel", "Daniel"));
        assertEquals("Hello guest", Grasshopper.greet("Greg", "Daniel"));
    }
}
