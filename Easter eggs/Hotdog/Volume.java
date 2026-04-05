import java.util.Scanner;
 
public class Volume { 

public static void main(String [] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter lenght:  ");
int userInput = input.nextInt ();

int sum = userInput * userInput * userInput;

System.out.println("The Volume is:  " + sum);
}

}
