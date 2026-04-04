 import java.util.Scanner;

   public class Taskone {
     
    public static void main(String[] args) {

     Scanner inputCollector = new Scanner(System.in);

     System.out.println("What the heck is your age?");

      int userInput = inputCollector.nextInt ();

      System.out.printf("Hello, your age is %d years old!!!%n", userInput);

    }

  }
