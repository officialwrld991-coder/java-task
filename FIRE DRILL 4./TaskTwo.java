
        public class TaskTwo {

        public static int [] reverse (int [] numbers) {
        
                  
        
        int [] reverse = new int [numbers.length];
        
        int reverseCount = 0;
        
        for (int count = numbers.length - 1; count >= 0; count--) {
        reverse[reverseCount] = numbers[count];
        reverseCount++;                       
        } 
        
        return reverse;
        
        }
        
        }
        
       

