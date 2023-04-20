package src.util;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Input {
    private Scanner scanner;
//    Input input = new Input();

    public Input() {
        this.scanner = new Scanner(System.in);    }

    public String getString() {
//        System.out.println("Enter a string: ");
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
        Input input = new Input();
        try {
            System.out.printf("Enter a number between %d and %d: %n", min, max);
            String userInput = input.getString();
            int number = Integer.valueOf(userInput);
            if (number > min && number < max) {
                return number;
            }
            System.out.println("Invalid, enter a number within the range: ");
            return getInt(min, max);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            getInt(min, max);
            return 0;
        }
    }

    public int getInt(int min, int max, String prompt) {
        Input input = new Input();
        try {
            System.out.printf(prompt);
            String userInput = input.getString();
            int number = Integer.valueOf(userInput);
            if (number > min && number < max) {
                return number;
            }
            System.out.println("Invalid, enter a number within the range: ");
            return getInt(min, max);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            getInt(min, max);
            return 0;
        }
    }

    public int getInt() {
        Input input = new Input();
        try {
            System.out.println("Enter an integer: ");
            String userInput =  input.getString();
            return Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("That is not a number, try again");
            return getInt();
        }
    }

    public int getInt(String prompt) {
        Input input = new Input();
        try {
            System.out.println(prompt);
            String userInput =  input.getString();
            return Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("That is not a number, try again");
            return getInt();
        }
    }

    public double getDouble(double min, double max){
        Input input = new Input();
        try {
            System.out.println("Enter a decimal number: ");
            String userInput = input.getString();
            double number = Double.valueOf(userInput);
            if (number > min && number < max) {
                return number;
            }
            System.out.println("Invalid, enter a number within the range: ");
            return getInt((int) min, (int) max);
        } catch (NumberFormatException e) {
            System.out.println("That is not a decimal number, try again.");;
            getDouble();
            return 0;
        }
    }

    public double getDouble(double min, double max, String prompt){
        Input input = new Input();
        try {
            System.out.println(prompt);
            String userInput = input.getString();
            double number = Double.valueOf(userInput);
            if (number > min && number < max) {
                return number;
            }
            System.out.println("Invalid, enter a number within the range: ");
            return getInt((int) min, (int) max);
        } catch (NumberFormatException e) {
            System.out.println("That is not a decimal number, try again.");;
            getDouble(min, max);
            return 0;
        }
    }

    public double getDouble(){
        Input input = new Input();
        try {
            System.out.println("Enter a decimal number: ");
            String userInput =  input.getString();
            return Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("That is not a decimal number, try again");
            return getDouble();
        }
    }

    public double getDouble(String prompt){
        Input input = new Input();
        try {
            System.out.println(prompt);
            String userInput =  input.getString();
            return Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("That is not a decimal number, try again");
            return getDouble();
        }
    }

    public int getBinary(String prompt){
        try {
            System.out.println(prompt);
            Input input = new Input();
            String userInput =  input.getString();
            return parseInt(userInput, 2);
        } catch(NumberFormatException e) {
            e.printStackTrace();
            System.out.println("That is not a binary number, try again");
            return getBinary(prompt);
        }
    }

    public int getHex(String prompt){
        try {
            System.out.println(prompt);
            Input input = new Input();
            String userInput =  input.getString();
            return Integer.parseInt(userInput, 16);
        } catch(NumberFormatException e) {
            e.printStackTrace();
            System.out.println("That is not a hexadecimal, try again");
            return getHex(prompt);
        }
    }

}
