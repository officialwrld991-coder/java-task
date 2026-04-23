import java.util.Scanner;

public class Age {

public static void main(String [] args) {

Scanner inputCollector = new Scanner(System.in);

System.out.print("Enter your Age: ");
int age = inputCollector.nextInt();

if (age >= 65) {
System.out.println("Age is greater than or equals to 65");
}

else {
System.out.println("Age is less than 65");
}

}

}
