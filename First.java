import java.util.Scanner;

   public class First {
     
    public static void main(String[] args) {

     Scanner inputCollector = new Scanner(System.in);

    System.out.println("enter first integer");

    int userInput = inputCollector.nextInt ();

    System.out.println("enter Second integer");

    int inputSecond = inputCollector.nextInt ();

     int sum = userInput * inputSecond;

      System.out.printf("The Answer is %d!!%n", sum);

  }

}
