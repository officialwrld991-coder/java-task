import java.util.Scanner;

   public class Tasktwenty {
     
    public static void main(String[] args) {

     Scanner inputCollector = new Scanner(System.in);
 
    System.out.print("enter base: \n");

    int userInput = inputCollector.nextInt ();

       System.out.print("enter height: \n");

    int inputTwo = inputCollector.nextInt ();
 
    int sum = userInput * inputTwo;


      System.out.printf("%nThe Area is %d!!!%n", sum);

}

}
