    import org.junit.jupiter.api.Test;

    import static org.junit.jupiter.api.Assertions.*;

    public class TaskThreeTest {



 @Test
    public void testThatArrayGivesTheOddElementInTheArray() {
         int [] numbers = {2,3,4,5,7,49,8,31,10}; 
        int [] expectedArray = {3,5,7,49,31};
        int [] actualArray = TaskThree.getOdd(numbers);
        assertArrayEquals(actualArray, expectedArray);
    }
    
    
    }

