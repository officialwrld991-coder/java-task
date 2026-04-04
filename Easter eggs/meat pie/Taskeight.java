 import java.util.Scanner;

   public class Taskeight {
     
    public static void main(String[] args) {

     Scanner inputCollector = new Scanner(System.in);

     System.out.println("Enter your favourite colour\n");

      String userInput = inputCollector.nextLine ();

    
  System.out.printf("%nThat's nice, %s is a beautiful colour!!%n", userInput);

    }

  }
