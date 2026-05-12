    import org.junit.jupiter.api.Test;

    import static org.junit.jupiter.api.Assertions.*;

    public class TaskFiveTest {



 @Test
    public void testThatArrayReturnsElementWithoutDuplicate() {
         int [] numbers = {2,3,4,2,7,4,4,9,8,3,10,5,2,3,4}; 
        int [] expectedArray = {2,3,4,2,7,9,8,10,5,2};
        int [] actualArray = TaskFive.getDuplicate(numbers);
        assertArrayEquals(actualArray, expectedArray);
    }
    
    
    }

