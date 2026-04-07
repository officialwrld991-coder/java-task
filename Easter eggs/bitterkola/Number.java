import java.util.Scanner;
public class Number {
            public static void main (String[] args) {
                        Scanner userInput = new Scanner(System.in);


                        System.out.println("Enter your number");
                        int number = userInput.nextInt();

                                                              
     
                       if (number > 10 || number < 101) {
                       System.out.println("you picked right");
                       }

                       else if (number > 101) {
                       System.out.println("you picked wrong");
                       }

                    }

                        }

