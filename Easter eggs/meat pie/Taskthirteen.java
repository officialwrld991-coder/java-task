 import java.util.Scanner;

   public class Taskthirteen {
     
    public static void main(String[] args) {

     Scanner inputCollector = new Scanner(System.in);
 
    System.out.print("enter first number\n");

    int userInput = inputCollector.nextInt ();

 System.out.print("enter second number\n");

    int inputTwo = inputCollector.nextInt ();

    System.out.print("enter third number\n");

    int inputThree = inputCollector.nextInt ();


    int sum = (userInput + inputTwo + inputThree) /3;


      System.out.printf("%nThe answer is %d!!!%n", sum);

   }
}
