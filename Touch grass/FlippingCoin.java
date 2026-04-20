public class FlippingCoin {

public static void main (String [] args) {

int number = 0;

int random = (int)(Math.random(1));

for (;random <= 1000000; random++) {
    if (random == 0 ) {
    System.out.println("Head");
    }
        
    else {
    System.out.println("Tail");
    }

}

}
}
