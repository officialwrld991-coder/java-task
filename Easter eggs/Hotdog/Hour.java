import java.util.Scanner;
 
public class Hour { 

public static void main(String [] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter time value in seconds:  ");
int userInput = input.nextInt ();

int hour = userInput / 3600;

int minutes = userInput / 60;


System.out.println("Your  total time is:  " + hour + " hours  " + minutes  + " minutes  ");


}

}
