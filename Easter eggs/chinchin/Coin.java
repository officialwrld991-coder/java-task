import java.util.Scanner;
public class Coin {
            public static void main (String[] args) {
                        Scanner input = new Scanner(System.in);


                        System.out.println("Pick a number between 0 and 1 to play this game of flipping a coin");
                        int inputOne = input.nextInt();


                         int comRand = (int)(Math.random() * 1);


                         String down = "Tail";
                         String up = "Head";


                        if(comRand == 1) {
                            System.out.printf("Your number = %d : Computer Number = %d: %s %n%n' You Won!!! %n",inputOne,comRand,up);
                        } else if(comRand == 0) {
                            System.out.printf("Your number = %d : Computer Number = %d: %s %n%n' You lost!!! %n",inputOne,comRand,down);
                       }
            }
}
