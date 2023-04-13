package src.util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);    }

    public String getString() {
        System.out.println("Enter a string: ");
        return scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Would you like to continue? [y/n]");
        String input = scanner.nextLine();
        return input.toLowerCase().contains("y");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String input = scanner.nextLine();
        return input.toLowerCase().contains("y");
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d: %n", min, max);
        int input = scanner.nextInt();
        if (input > min && input < max) {
            return input;
        }
        System.out.println("Invalid, enter a number within the range: ");
        return getInt(min, max);
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        int input = scanner.nextInt();
        if (input > min && input < max) {
            return input;
        }
        System.out.println("Invalid, enter a number within the range: ");
        return getInt(min, max);
    }

    public int getInt() {
        System.out.println("Enter an integer: ");
        return scanner.nextInt();
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        System.out.println("Enter a decimal number: ");
        double input = scanner.nextDouble();
        if (input > min && input < max) {
            return input;
        }
        System.out.println("Invalid entry, enter a decimal number within the range");
        return getDouble();
    }

    public double getDouble(double min, double max, String prompt){
        System.out.println(prompt);
        double input = scanner.nextDouble();
        if (input > min && input < max) {
            return input;
        }
        System.out.println("Invalid entry, enter a decimal number within the range");
        return getDouble();
    }

    public double getDouble(){
        System.out.println("Enter a decimal number: ");
        return scanner.nextDouble();
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }


}
