import java.util.Scanner;

   public class Tasktwentynine {
     
    public static void main(String[] args) {

     Scanner inputCollector = new Scanner(System.in);

     System.out.print("Enter first number: ");
    int inputNum = inputCollector.nextInt();
 

    System.out.print("Enter second number: ");
    int numInput = inputCollector.nextInt();

     int sum = inputNum + numInput;

      int product = inputNum * numInput;

      System.out.println("The sum is :  " + sum + " The product is :  " + product);

    }

}
