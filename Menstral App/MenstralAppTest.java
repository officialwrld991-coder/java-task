    import org.junit.jupiter.api.Test;

    import static org.junit.jupiter.api.Assertions.*;
    
    public class MenstralAppTest {
    
    
    @Test
    
    public void testThatEmailIsValid () {
    String email = "official@gmail.com";
    boolean validEmail = MenstralApp.validEmail(email);
    assertTrue(validEmail);
    }
    
     @Test
    
    public void testThatPasswordIsValid () {
    String password = "123456789";
    boolean validPassword = MenstralApp.validPassword(password);
    assertTrue(validPassword);
    }
    
     @Test
    
    public void testThatCycleLengthIsValid () {
    int actualCycle = MenstralApp.validCycleLength (20);
    int expectedCycle = 20;
    assertEquals(actualCycle, expectedCycle);
    }    
    
      @Test
    
    public void testThatperiodDayIsRight () {
    int actualPeriod = MenstralApp.validCycleLength (7);
    int expectedPeriod = 7;
    assertEquals(actualPeriod, expectedPeriod);
    }    
    
    @Test
    
    public void testThatCalculateOvulationDate () {
    int actualOvulation = MenstralApp.ovulationDate (15);
    int expectedOvulation = 15;
    assertEquals(actualOvulation, expectedOvulation);
    
    }
    
    @Test
    
    public void testThatCalculateFertileWindowDate () {
    int actual = MenstralApp.fertileWindow (15);
    int expected = 15;
    assertEquals(actual, expected);
    
    }
    
    
    
    
    
    
    
    
    
    
    }
    

