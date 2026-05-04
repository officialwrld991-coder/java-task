    import java.util.Scanner;        
        
    public class TaskFour {
    
    public static int [] evenIndex (int [] even) {
    
    Scanner inputCollector = new Scanner(System.in);
    
    int count = 0;
    
      int [] scores = new int [10];    
    for (count = 0; count < 10; count++) {
    System.out.print("Enter your Score: ");
    int userInput = inputCollector.nextInt();
    
    scores[count] = userInput;
    }
    
    int [] evenNumber = new int [5];
    
    int store = 0;
    
    for(int index = 0; index < scores.length; index+=2) {
//        if (even[index] % 2 == 0) {
        evenNumber[store] = even[index];        
        
   
     }
     
     return evenNumber;
     
     
     }
     
     }
     
     
   
