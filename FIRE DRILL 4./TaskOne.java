import java.util.Scanner;


        public class TaskOne {

        public static int [] storeNumber (int numbers) {
        
        
        Scanner inputCollector = new Scanner (System.in);        
        
        int [] number = new int [10];
        
        
        for (int count = 0; count < 10; count++) {
        
        System.out.print("Enter a number: ");
        int userInput = inputCollector.nextInt();
        
        number[count] = userInput; 
                               
        } 
        
        return number;
        
        
        }
        
        
        }
