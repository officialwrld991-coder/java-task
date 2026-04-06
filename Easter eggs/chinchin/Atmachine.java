import java.util.Scanner;
public class Atmachine {
            public static void main (String[] args) {
                        Scanner input = new Scanner(System.in);


                        System.out.println("Enter your ATM machine");
                        int inputOne = input.nextInt();

                          int password = 1234; 

                       if (inputOne == password) {
                        System.out.println("Yaaay!! your balance is $ 1,000");
                        }

                          else if (inputOne != password) {
                        System.out.println("incorrect pin!!");
                           }
                                              
   }

}
