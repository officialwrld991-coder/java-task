import java.util.Scanner;
public class Validpin {
            public static void main (String[] args) {
                        Scanner userInput = new Scanner(System.in);


                        System.out.println("Enter your 4 digit pin");
                        int inputOne = userInput.nextInt();

                        if (inputOne >= 1000 || inputOne <= 9999) {
                         System.out.println("Valid pin"); 
                          }

                        else if (inputOne > 9999) {
                        System.out.println("invalid pin"); 
                         }

                    }

                        }

