    import org.junit.jupiter.api.Test;

    import static org.junit.jupiter.api.Assertions.*;
    
    public class TaskFiveTest {
    
    @Test
    
    public void testElementsInArrayContainsOddNumber () {
        int [] odd = {20, 42, 31, 64, 72, 90, 57, 82, 77, 59};
        int [] expectedOddArray = {31, 57, 77, 59};
        int [] actualOddArray = TaskFive.oddIndex(odd);
        assertArrayEquals(actualOddArray, expectedOddArray);
    }


        }    
