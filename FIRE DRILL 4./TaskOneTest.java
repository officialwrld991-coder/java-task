    import org.junit.jupiter.api.Test;

    import static org.junit.jupiter.api.Assertions.*;

    public class TaskOneTest {
    
    @Test
    
    public void testThatTaskOneTestReturnsAnArray() {
    
    int [] number = new int [10];
    
    int [] expectedNumber = number;
    
    int [] actualNumber = TaskOne.storeNumber(numbers);
    
    assertEquals(actualNumber, expectedNumber);
    
    }
    
    
  }
    
    

