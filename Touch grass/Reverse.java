import java.util.Scanner;

public class Reverse {

public static void main (String [] args) {

Scanner inputCollector = new Scanner(System.in);


System.out.print("Enter your Number: ");
int number = inputCollector.nextInt();

while (number > 0) {
int remainder = number % 10;
System.out.print(remainder + "  ");
int divided = number / 10;
number = divided;
}

}
}

