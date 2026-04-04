 import java.util.Scanner;

   public class Taskten {
     
    public static void main(String[] args) {

     Scanner inputCollector = new Scanner(System.in);
 
    System.out.print("enter your number\n");

    int userInput = inputCollector.nextInt ();


     int sum = userInput / 2;


      System.out.printf("The answer is %d!!!%n", sum);

   }
}
