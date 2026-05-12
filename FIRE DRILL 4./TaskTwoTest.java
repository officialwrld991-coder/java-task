    import org.junit.jupiter.api.Test;

    import static org.junit.jupiter.api.Assertions.*;

    public class TaskTwoTest {



 @Test
    public void testThatReverseArrayGivesArrayFromTheLastElement() {
        int [] numbers = {1,2,3,4,5,6,7};
        int [] expectedArray = {7,6,5,4,3,2,1};
        int [] actualArray = TaskTwo.reverse(numbers);
        assertArrayEquals(actualArray, expectedArray);
    }
    
    
    }

