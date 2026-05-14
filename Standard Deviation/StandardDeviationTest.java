        import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

        public class StandardDeviationTest {


        @Test
        
        public void testThatArrayCollectsNumberAndReturnTheSum (){
        
        int [] data = {10,15,17,18};
        
        double expecteddata = 60;
        
        double actualdata = StandardDeviation.getdata(data);
        
        assertEquals(expecteddata, actualdata);
        
        }
        
        @Test 
        
        public void testThatNumbersCollectedInTheArrayReturnsMeanValue () {
        
        int [] data = {10,15,17,18};
        
        double average = 60 / 4;
        
        double expectedAverage = 15;
        
        double actualAverage = StandardDeviation.getAverage(data);
        
        assertEquals(expectedAverage, actualAverage);
        
        }
        
        @Test 
        
        public void testThatNumbersCollectedInTheArrayMinusAverageGivesMeanDeviation () {
        
        int [] data = {10,15,17,18};
        
        double meanDeviation = 0;
        
        double expectedMeanDeviation = 0;
        
        double actualMeanDeviation = StandardDeviation.getMeanDeviation(data);
        
        assertEquals(expectedMeanDeviation, actualMeanDeviation);
        
        }
        
        @Test 
        
        public void testThatNumbersCollectedInTheArrayCalculatesTheVariance () {
        
        int [] data = {10,15,17,18};
        
        double variance = 59;
        
        double expectedVariance = 14.75;
        
        double actualVariance = StandardDeviation.getVariance(data);
        
        assertEquals(expectedVariance, actualVariance);
        
        }
        
        @Test 
        
        public void testThatNumbersCollectedInTheArrayCalculatesTheStandardDeviation () {
        
        int [] data = {10,15,17,18};
        
        double variance = 59;
        
        double standardDeviation = 0;
        
        double expectedStandardDeviation = 3.84;
        
        double actualStandardDeviation = StandardDeviation.getStandardDeviation(data);
        
        assertEquals(actualStandardDeviation, expectedStandardDeviation);
        
        }
        
        }
