    import java.util.Scanner;
    
    public class TaskFive {
    
    public static int [] oddIndex (int [] odd) {
    
    Scanner inputCollector = new Scanner(System.in);
    
    int count = 0;
    
    int [] scores = new int [10];
    
    for (count = 0; count < 10; count++) {
    System.out.print("Enter your Score: ");
    int userInput = inputCollector.nextInt();
    
    scores[count] = userInput;
    }
    
    int [] oddNumber = new int [3];
    
    int store = 0;
    
    for(int index = 0; index < scores.length; index++) {
//        if (scores[index] % 2 == 1) {
        oddNumber[store] = scores[index];        
        }
   
     }
     
     return oddNumber;
     
     
     }
     
     }
     
     
   
