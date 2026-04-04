import java.util.Scanner;

   public class Tasktwentyfive {
     
    public static void main(String[] args) {

     Scanner inputCollector = new Scanner(System.in);
 
    System.out.print("What is your name: ");
    String userInput = inputCollector.nextLine();

     System.out.print("How old are you: ");
    int inputNum = inputCollector.nextInt();
 
  


      System.out.println("Hello everyone, I am " + userInput + " and I am " + inputNum + " years old");

    }

}
