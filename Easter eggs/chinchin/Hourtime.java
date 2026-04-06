import java.util.Scanner;
public class Hourtime {
            public static void main (String[] args) {
                        Scanner input = new Scanner(System.in);


                        System.out.println("Enter your current hour");
                        int inputOne = input.nextInt();

                        if (inputOne <=4 ||  inputOne>= 25) {
                         System.out.println("null!!");
                         }

                                     
                       else if(inputOne <= 11 ) {
                            System.out.println("Yaayyy!!, Your hour says you are in the morning!!");
                          }  
                       
                    
                      else if(inputOne <= 17) {
                            System.out.println("Yoooo!!, Your hour says you are in the afternoon!!");
                            }


                      else if(inputOne <= 21 ) {
                            System.out.println("hmm!!, Your hour says you are in the Evening!!");
                             }

                     else if(inputOne <= 24 ) {
                            System.out.println("hmm!!, Your hour says you are in the night!!");
                             }





}

}
