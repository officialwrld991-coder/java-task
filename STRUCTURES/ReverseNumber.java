    public class ReverseNumber {

    public static int [] reverse (int number) {

    int [] count = new int [5];
        
      
    for (int index = 0; index < count.length; index++) {
    
    int divided = number % 10;
    
    count[index] = divided;
    
    number = number / 10;
    }
    
    return count;
    }
    
    }
    
    
    
    
   
