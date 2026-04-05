import java.util.Scanner;
 
public class Gratuity { 

public static void main(String [] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter subtotal:  ");
float userInput = input.nextFloat ();

System.out.print("Enter gratuity value:  ");
float inputOne = input.nextFloat ();

float sum = userInput / 1.20048f;

float secondSum = (inputOne / 100) + 11.08f;  

System.out.println("When Subtotal is:  " + sum + "     Gratuity value is:  " + secondSum);
}

}
