    import org.junit.jupiter.api.Test;

    import static org.junit.jupiter.api.Assertions.*;

    public class TaskFourTest {



 @Test
    public void testThatArrayGivesTheEvenElementInTheArray() {
         int [] numbers = {2,3,4,5,7,49,8,31,10,22,34};  
        int [] expectedArray = {2,4,8,10,22,34};
        int [] actualArray = TaskFour.getEven(numbers);
        assertArrayEquals(actualArray, expectedArray);
    }
    
    
    }

