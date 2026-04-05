import java.util.Scanner;
 
public class Kilometer { 

public static void main(String [] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter your miles value:  ");
float userInput = input.nextFloat();

float sum = userInput * 1.609f;

System.out.println("The Kilometer is:  " + sum);
}

}
