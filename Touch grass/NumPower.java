import java.util.Scanner;

public class NumPower {

public static void main (String [] args) {

Scanner inputCollector = new Scanner(System.in);

int sum = 1;
int count = 2;

System.out.print("Enter your Number: ");
int number = inputCollector.nextInt();

while (number > 0) {
sum = (int)Math.pow(count, number);
System.out.println(sum);
number--;
}




}

}
