import java.util.Scanner;

public class AverageNum {

public static void main (String [] args) {

Scanner inputCollector = new Scanner(System.in);

int count = 0; 
int sum = 0;
System.out.print("Enter your Number: ");
int userInput = inputCollector.nextInt ();
while (userInput >= 0) {
userInput += sum;
count++;
System.out.println("count is: " + count);
System.out.print("Enter your Number: ");
int newInput = inputCollector.nextInt ();
userInput = newInput + sum;

}
int average = userInput;

System.out.print("The sum of Number is: " + average);

}
}


