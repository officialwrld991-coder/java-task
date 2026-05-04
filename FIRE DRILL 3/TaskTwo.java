  import java.util.Scanner;
  
  public class TaskTwo {
  
  public static void main (String [] args) {
  
    Scanner inputCollector = new Scanner(System.in);

    int count = 0;
    
    int [] scores = new int [10];
    
    for (count = 0; count < 10; count++) {
    System.out.print("Enter your Score: ");
    int userInput = inputCollector.nextInt();
    
    scores[count] = userInput;
    }
    
    for(int index = 0; index < scores.length; index++) {
    System.out.print(scores[index] + "\t");
    
    }
    }
    }
