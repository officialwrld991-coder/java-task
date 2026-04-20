public class MultiplyTable {

public static void main(String [] args) {

int number = 5;
int count = 1;
System.out.println("Multiplication Table of 5");

for (count = 1; count <= 12; count++) {
int product = number * count;
System.out.println("5 * "+ count + " = " + product);
}

}
}

