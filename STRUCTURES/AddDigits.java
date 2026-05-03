public class AddDigits {

public static int sumOfDigits (int number) {


int add = 0;

while(number >= 0) {
    int divided = number % 10;
    add += divided;
    number = number / 10;
}

return add;

}


}
