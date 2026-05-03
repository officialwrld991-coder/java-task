    public class Digits {

    public static int sumDigits (int number) {
    
    int add = 0;
    
    while (number >=0) {
    
    int divided = number % 10;
    
    add += divided;
    
    number = number / 10;
    }
    
    return add;
    }
    
    }
    
    
    
    
   
