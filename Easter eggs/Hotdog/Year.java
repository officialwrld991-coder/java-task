import java.util.Scanner;
 
public class Year { 

public static void main(String [] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter time value in minute:  ");
int userInput = input.nextInt ();

int year = userInput / 525600;

int month = userInput / 43800;

int weeks = userInput / 10080;

int days = userInput / 1440;

int hours = userInput / 60;

int minute = userInput / userInput;

int seconds = userInput * 60;


System.out.println("Your  total is:  " + year + " years  " + month  + " months  " +  weeks + " weeks  " +  days + " days  " + hours + " hours  " + minute + " minute  " + seconds + " seconds  ");


}

}
