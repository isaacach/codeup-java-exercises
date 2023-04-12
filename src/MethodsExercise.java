package src;

import java.util.Random;
import java.util.Scanner;

public class MethodsExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println(add(4, 5));
//        System.out.println(subtract(9, 10));
//        System.out.println(multiply(78, 3));
//        System.out.println(divide(90, 5));
//        System.out.println(modulus(39, 6));
//        System.out.println(recurMult(3, 9));

//        getInteger(1, 10);

        System.out.println("Enter a number between 1 and 10");
        int fact = sc.nextInt();
        factorial(fact);

//        System.out.println("How many sides on the dice?");
//        int sides = sc.nextInt();
//        dice(sides);
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static float subtract(float a, float b) {
        return a - b;
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static float recurMultiply(float a, float b) {
        if (a < b) {
            return recurMultiply(b, a);
        }else if (b != 0) {
            return (a + recurMultiply(a, b - 1)); //3,2 -
        } else {
            return 0;
        }
    }

    public static float divide(float a, float b) {
        return a / b;
    }

    public static float modulus(float a, float b) {
        return a % b;
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number between 1 and 10");
        int num = sc.nextInt();
        if (num >= min && num <= max) {
            System.out.println(num);
            return num;
        } else {
            return getInteger(1, 10);
        }
    }

    public static int factorial(int num) {
        String cont = "y";
        Scanner sc = new Scanner(System.in);
        int count = 1;
        for (int i = 2; i <= num; i++) {
            count *= i;
        }
        System.out.println(count);
        System.out.println("Would you like to continue? [y/n]");
        cont = sc.nextLine().trim();
        if (cont.equalsIgnoreCase("y")) {
            System.out.println("Enter a number between 1 and 10");
            int fact = sc.nextInt();
            factorial(fact);
        }
        return num;
    }

    public static void dice(int sides) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rolling dice....");
        Random rand = new Random();
        int min=1;
        int dice1 = rand.nextInt(sides - min + 1) + min;
        int dice2 = rand.nextInt(sides - min + 1) + min;
        System.out.println("You rolled a " + dice1 + " and a " + dice2);
        System.out.println("Do you want to roll again? [y/n]");
        String cont = sc.nextLine();
        if (cont.equalsIgnoreCase("y")) {
            dice(sides);
        }
    }

}
