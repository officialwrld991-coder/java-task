import java.util.Scanner;

public class CountDown {

public static void main (String [] args) {

Scanner inputCollector = new Scanner(System.in);


System.out.print("Enter your Number: ");
int number = inputCollector.nextInt();

while (number > 0) {
System.out.println(number);
number--;
}


System.out.println("BLAST OFF!!");

}

}
