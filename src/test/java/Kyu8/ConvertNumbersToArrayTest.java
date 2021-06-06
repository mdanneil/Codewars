package Kyu8;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ConvertNumbersToArrayTest {
    @Test
    public void tests() {
        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, ConvertNumbersToArray.digitize(35231));
    }
}
