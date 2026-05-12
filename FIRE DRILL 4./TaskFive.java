 public class TaskFive {

        public static int [] getDuplicate (int [] numbers) {
        
        int [] number = {2,3,4,2,7,4,4,9,8,3,10,5,2,3,4};      
        
        int [] duplicate = new int [10];
        
        int evenCount = 0;
        
        for (int count = 0; count < numbers.length; count++) {
        if (numbers[count] == duplicate[evenCount]) {
        duplicate[evenCount] += numbers[count];
        evenCount++;                       
        } 
        
        }
        
        return duplicate;
        
        }
        
        }
