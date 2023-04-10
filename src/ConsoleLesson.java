package src;

import java.util.Scanner;

public class ConsoleLesson {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two words separated by a space");
        String input1 = scanner.next();
        String input2 = scanner.next();
        System.out.printf("You entered the words: %s and %s %n", input1, input2);

//        ### Mini exercise: Hello, name
//        Write a Java program that asks the user for their name, then outputs "Hello, name", using
//        .println, then using .printf

        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Hello, " + name);
        System.out.printf("Hello, %s%n", name);
        scanner.nextLine();

        System.out.println("Enter an integer:");
        int num = scanner.nextInt();
        System.out.printf("Your integer was %s", num);


    }
}
