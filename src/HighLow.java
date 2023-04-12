package src;

import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("I have picked a random number between 1 to 100, guess what it is:");
        int guess = sc.nextInt();
        guessingGame(guess);
    }
    public static void guessingGame(int num) {
        int guessCount = 1;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt(100 - 1 + 1) + 1;
        System.out.println("Random number => " +randomNum);
        while (randomNum != num) {
            if (guessCount > 9) { //guess limit is 10
                System.out.println("Sorry, you've reached the guess limit.");
                return;
            } else if (num < randomNum) {
                System.out.println("HIGHER!");
                num = sc.nextInt();
                guessCount++;
            } else if (num > randomNum) {
                System.out.println("LOWER!");
                num = sc.nextInt();
                guessCount++;
            }
        }
        System.out.println("Great job, the number was " + randomNum + ".  It took you " + guessCount + " guesses");
    }
}
