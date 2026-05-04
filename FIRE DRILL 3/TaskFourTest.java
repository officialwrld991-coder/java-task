    import org.junit.jupiter.api.Test;

    import static org.junit.jupiter.api.Assertions.*;
    
    public class TaskFourTest {
    
    @Test
    
    public void testElementsInArrayContainsEvenNumber () {
        int [] even = {20, 42, 31, 64, 72, 90, 57, 82, 77, 59};
        int [] expectedEvenArray = {20, 31, 72, 57, 77,};
        int [] actualEvenArray = TaskFour.evenIndex(even);
        assertArrayEquals(actualEvenArray, expectedEvenArray);
    }


        }    
