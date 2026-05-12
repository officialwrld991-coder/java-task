 public class TaskThree {

        public static int [] getOdd (int [] numbers) {
        
        int [] number = {2,3,4,5,7,49,8,31,10};      
        
        int [] odd = new int [5];
        
        int oddCount = 0;
        
        for (int count = 0; count < numbers.length; count++) {
        if (numbers[count] % 2 != 0) {
        odd[oddCount] = numbers[count];
        oddCount++;                       
        } 
        
        }
        
        return odd;
        
        }
        
        }
