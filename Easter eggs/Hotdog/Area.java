import java.util.Scanner;
 
public class Area { 

public static void main(String [] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter lenght:  ");
float userInput = input.nextFloat();

float sum = (userInput * userInput) * 0.8660f;

System.out.println("The Area is:  " + sum);
}

}
