 public class TaskFour {

        public static int [] getEven (int [] numbers) {
        
        int [] number = {2,3,4,5,7,49,8,31,10,22,34};      
        
        int [] even = new int [6];
        
        int evenCount = 0;
        
        for (int count = 0; count < numbers.length; count++) {
        if (numbers[count] % 2 == 0) {
        even[evenCount] = numbers[count];
        evenCount++;                       
        } 
        
        }
        
        return even;
        
        }
        
        }
