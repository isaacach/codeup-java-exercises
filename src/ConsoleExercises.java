package src;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        double pi = 3.14159;
        System.out.format("The approximate value of pi is %.2f%n", pi);

        System.out.println("Enter an integer: ");
        int userNum = scanner.nextInt();
        System.out.println("Your integer is: " + userNum);

        System.out.println("Enter three words");
        String wordOne = scanner.next();
        String wordTwo = scanner.next();
        String wordThree = scanner.next();
        System.out.printf("Your words are: %s, %s, and %s", wordOne, wordTwo, wordThree);

        System.out.println("Enter three words");
        String words = scanner.nextLine();
        System.out.println("Your three words: " + words);

        System.out.println("Enter the length and width of the classroom in feet: ");
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int area = length * width;
        int perimeter = 2*length + 2*width;
        System.out.printf("The area of the classroom is: %d square feet %n", area);
        System.out.printf("The perimeter of the classroom is: %d feet %n", perimeter);

    }
}
