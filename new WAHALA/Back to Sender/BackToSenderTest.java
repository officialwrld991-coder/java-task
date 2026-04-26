import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackToSenderTest{
    
	@Test
	
    public void testThatCalculatesWageOfSuccessfulDelivery(){
        // Given
        
        int testInput = 80;
        
        // When
        
        int actualResult = BackToSender.wageCalculator(testInput);
        
	    //check
	    
	    int expectedResult = 80 * 500 + 5000;
	    assertEquals(expectedResult, actualResult);
	    }
	    
	    
	    }
