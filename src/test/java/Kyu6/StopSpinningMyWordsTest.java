package Kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StopSpinningMyWordsTest {
    @Test
    public void test() {
        assertEquals("emocleW", new StopSpinningMyWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new StopSpinningMyWords().spinWords("Hey fellow warriors"));
        assertEquals("This is a test", new StopSpinningMyWords().spinWords("This is a test"));
        assertEquals("This is rehtona test", new StopSpinningMyWords().spinWords("This is another test"));
        assertEquals("This ecnetnes is a ecnetnes", new StopSpinningMyWords().spinWords("This sentence is a sentence"));
        assertEquals("You are tsomla to the last test", new StopSpinningMyWords().spinWords("You are almost to the last test"));
        assertEquals("Just gniddik ereht is llits one more", new StopSpinningMyWords().spinWords("Just kidding there is still one more"));
        assertEquals("ylsuoireS this is the last one", new StopSpinningMyWords().spinWords("Seriously this is the last one"));
    }
}
