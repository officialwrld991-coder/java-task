import java.util.Scanner;
public class Minute {
            public static void main (String[] args) {
                        Scanner userInput = new Scanner(System.in);


                        System.out.println("Enter your minute value");
                        int minute = userInput.nextInt();

                         int days = minute / 1440;

                         int hours = minute / 60;
                                             
                        System.out.println("your times reads: " + days  + " days " + hours + " hours "); 

                    }

                        }

