package Kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllStarCodeChallenge22Test {

        AllStarCodeChallenge22 timeConverter = new AllStarCodeChallenge22();

        @Test
        public void fixedTests() {
            assertEquals("1 hour(s) and 0 minute(s)", timeConverter.toTime(3600));
            assertEquals("1 hour(s) and 0 minute(s)", timeConverter.toTime(3601));
            assertEquals("0 hour(s) and 58 minute(s)", timeConverter.toTime(3500));
            assertEquals("89 hour(s) and 51 minute(s)", timeConverter.toTime(323500));
            assertEquals("0 hour(s) and 0 minute(s)", timeConverter.toTime(0));
        }
}
