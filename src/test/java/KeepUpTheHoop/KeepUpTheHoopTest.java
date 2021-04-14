package KeepUpTheHoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KeepUpTheHoopTest {

    @Test
    public void testHoopCount(){
        HelpAlex hoops = new HelpAlex();
        assertEquals("Great, now move on to tricks", HelpAlex.hoopCount(11));
        assertEquals("Keep at it until you get it", HelpAlex.hoopCount(7));
    }
}
