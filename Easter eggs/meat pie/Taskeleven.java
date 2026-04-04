 import java.util.Scanner;

   public class Taskeleven {
     
    public static void main(String[] args) {

     Scanner inputCollector = new Scanner(System.in);
 
    System.out.print("enter your number\n");

    double userInput = inputCollector.nextDouble ();


    double again = userInput * 2;


      System.out.println("The double of " + userInput  + " is: "  + again);

   }
}
