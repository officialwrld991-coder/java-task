import java.util.Scanner;
public class Age {
            public static void main (String[] args) {
                        Scanner userInput = new Scanner(System.in);


                        System.out.println("Enter your year of birth");
                        int birthYear = userInput.nextInt();

                        
                        int currentYear = 2026;
                         
                          int sum = currentYear - birthYear;

                        if (birthYear > currentYear) {
                        System.out.println("you entered an invalid year");
                           }  
                    
                          else if (birthYear < currentYear) {                                          
                        System.out.println("Hello!! you are " + sum + " years old"); 
                         }

                        else if (sum > 65) {                                          
                        System.out.println("Yaay!! you are " + sum + " years old," + " you are eligible for citizen discount"); 
                         }


                    }

                        }

