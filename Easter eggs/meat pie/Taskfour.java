 import java.util.Scanner;

   public class Taskfour {
     
    public static void main(String[] args) {

     Scanner inputCollector = new Scanner(System.in);

     System.out.println("enter first integer\n");

      int userInput = inputCollector.nextInt ();

    System.out.println("enter second integer\n");


    int inputTwo = inputCollector.nextInt ();  


    int sum = userInput * inputTwo;

      System.out.printf("Final answer = %s%n", sum);

    }

  }
