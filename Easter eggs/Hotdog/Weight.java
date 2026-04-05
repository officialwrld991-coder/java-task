import java.util.Scanner;
 
public class Weight { 

public static void main(String [] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter weight value:  ");
float userInput = input.nextFloat ();

System.out.print("Enter height value:  ");
float inputOne = input.nextFloat ();

float pounds = userInput / 2.205f;

float metre = inputOne / 39.37f;


System.out.println("Your  kilogram  is:  " + pounds + "  and your inch value is " + metre);


}

}
