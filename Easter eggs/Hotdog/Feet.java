import java.util.Scanner;
 
public class Feet { 

public static void main(String [] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter meters:  ");
float userInput = input.nextFloat ();

float sum = userInput * 3.281f;

System.out.println("The Feet value is:  " + sum);
}

}
