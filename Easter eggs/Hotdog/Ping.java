import java.util.Scanner;
 
public class Ping { 

public static void main(String [] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter square meter:  ");
float userInput = input.nextFloat ();

float sum = userInput / 3.306f;

System.out.println("The Ping value is:  " + sum);
}

}
