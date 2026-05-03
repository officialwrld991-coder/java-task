public class Factorial {

public static int numberFactorial (int number) {


int multiply = 1;

for(int index = 1; index <= number; index++) {
 multiply *= index;
}

return multiply;

}


}
