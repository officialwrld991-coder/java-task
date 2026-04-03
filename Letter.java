import java.util.Scanner;

   public class Letter {
     
    public static void main(String[] args) {

     Scanner inputCollector = new Scanner(System.in);

     System.out.println("What the heck is your name?");

      String userInput = inputCollector.nextLine ();

      System.out.printf("Hello %s!!!%n", userInput);
  
      System.out.println("How old do you think you are?");

       int ageInput = inputCollector.nextInt();

     System.out.printf("Woow!!!, you are %d years old!!!, THAT'S CUTE%n", ageInput);
   
       
      
}
}
