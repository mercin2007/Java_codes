import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void main(String[] args){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int target=random.nextInt(100)+1;
        int guess=0;
        System.out.println("Guess a number between 1 and 100");
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            if(guess<target){
                System.out.println("your VALUE TO HIGH");
            }
            else if(guess>target){
                System.out.println("your VALUE TO LOW");
            }
            else{
                System.out.println("CONGRATULATIONS! YOU GUESSED is correct: ");
                }

                 
            }while(guess!=target);
            sc.close();
    }
}