import java.util.Scanner;
public class Area {
            public static void main (String[] args) {
                        Scanner input = new Scanner(System.in);


                        System.out.println("Enter your height");
                        int inputOne = input.nextInt();

                       System.out.println("Enter your base");
                        int inputTwo = input.nextInt();


                      int sum = inputOne * inputTwo; 

                      System.out.println("Triangle Area =  " + sum);

   }
}
