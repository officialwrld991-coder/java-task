import java.util.Scanner;

public class AlphabetKey {

public static void main (String [] args) {

Scanner inputCollector = new Scanner(System.in);

System.out.print("Enter your Alphabet: ");
char input = inputCollector.nextChar();

if (input == 'a' || input == 'b' || input == 'c') {
System.out.println("2");
}

else if (input == 'd' || input == 'e' || input == 'f') {
System.out.println("3");
}

else if (input == 'g' || input == 'h' || input == 'i') {
System.out.println("4");
}

else if (input == 'j' || input == 'k' || input == 'l') {
System.out.println("5");
}

else if (input == 'm' || input == 'n' || input == 'o') {
System.out.println("6");
}

else if (input == 'p' || input == 'q' || input == 'r' || input == 's') {
System.out.println("7");
}

else if (input == 't' || input == 'u' || input == 'v') {
System.out.println("8");
}

else if (input == 'w' || input == 'x' || input == 'y' || input == 'z') {
System.out.println("9");
}

else {
System.out.println("Invalid Input");
}

}
}


