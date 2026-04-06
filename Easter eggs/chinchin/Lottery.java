import java.util.Scanner;
public class Lottery {
            public static void main (String[] args) {
                        Scanner userInput = new Scanner(System.in);


                        System.out.println("Enter first integer");
                        int userOne = userInput.nextInt();


                         int comOne = (int)(Math.random() * 10) + 1;


                        System.out.println("Enter  second integer");
                        int userTwo = userInput.nextInt();


                         int comTwo = (int)(Math.random() * 10) + 1;


                        if(userOne == comOne && userTwo == comTwo) {
                            System.out.println("Lottery number:    " + comOne + comTwo  + "  player number:   " + userOne + userTwo + "  Congratulations you have won $10,000");
                        } 
                        else if(comOne == userOne || comOne == userTwo || comTwo == userOne || comTwo == userTwo) {
                            System.out.println("Lottery number:    " + comOne + comTwo  + "  player number:   " + userOne + userTwo + "  Congratulations you have won $1,000");        
                        }
                        else if(comOne != userOne || comOne != userTwo || comTwo != userOne || comTwo != userTwo) {
                            System.out.println("Your money is gone, OTILOR!!");        
                        }
}
}
   
