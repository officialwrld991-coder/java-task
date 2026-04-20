import java.util.Scanner;

public class YearStatus {

public static void main (String [] args) {

Scanner inputCollector = new Scanner(System.in);

System.out.print("Enter your Course Major: ");
String courseMajor = inputCollector.nextLine();

switch (courseMajor) {
    case "I": System.out.println("Information Management");
        break;
    case "C": System.out.println("Computer Science");
        break;
    case "A": System.out.println("Accounting");
        break;
    default: System.out.println("Invalid Input");
        break;
          }
       
  
System.out.print("Enter your Year: ");
int year = inputCollector.nextInt();
       
switch (year) {
    case 1: System.out.println("Freshman");
        break;
    case 2: System.out.println("Sophomore");
        break;
    case 3 : System.out.println("Junior");
        break;
    case 4: System.out.println("Senior");
        break;
    default: System.out.println("Invalid Input");
        break;
        }

}

}

