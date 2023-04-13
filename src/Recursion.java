package src;

import java.util.Scanner;

public class Recursion {

    public static int sumOfNumbers(int num) {
        if (num == 0) {
            return num;
        } else {
            return num + sumOfNumbers(num - 1);
        }
    }

    public static boolean isPalindrome(String word) {
        if (word.length() == 0 || word.length() == 1) {
            return true;
        }
        if (word.charAt(0) == (word.charAt(word.length()-1))) {
            return isPalindrome(word.substring(1, word.length()-1));
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to add the sum of numbers from 0 to your number:");
        int userNum = sc.nextInt();
        System.out.println(sumOfNumbers(userNum));
        sc.nextLine();
        System.out.println("Enter a word to check if it is a palindrome:");
        String userWord = sc.nextLine();
        System.out.println(isPalindrome(userWord));
    }
}
