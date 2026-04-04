import java.util.Scanner;

   public class Tasktwentyone {
     
    public static void main(String[] args) {

     Scanner inputCollector = new Scanner(System.in);
 
    System.out.print("enter radius: ");
    double userInput = inputCollector.nextDouble();
 
    double sum = userInput * 2;

     double area = sum * 3.142;


      System.out.println("The area of radius is: " + area);

    }

}
