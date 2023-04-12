package src;

import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
//        String str = "Hello, World!";
//        System.out.println(str);
//        System.out.println(str.indexOf('W'));
//        str = str.replace("World", "Isaac");
//        System.out.println(str);
//        String isaac = str.substring(7, 12);
//        System.out.println(isaac);
//        System.out.println(str.indexOf("o"));


        String exer1 = "we don't need no education";
        System.out.println(exer1);
        System.out.println(exer1.replace("education", "thought control"));
        String exer = "we don't need no education\nwe don't need no thought control";

        String exer2 = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(exer2);

        String exer3 = "In windows, the main drive is usually C:\\";
        System.out.println(exer3);

        String exer4 = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";
        System.out.println(exer4);

        Scanner sc = new Scanner(System.in);
        String cont = "y";
        while(cont.trim().equalsIgnoreCase("y")) {
            System.out.println("What would you like to say to Bob?");
            String input = sc.nextLine();
            if(input.equals("")) {
                System.out.println("Bob:  Fine, be that way!");
            }else if (input.endsWith("?")){
                System.out.println("Bob: sure");
            }else if(input.equals(input.toUpperCase())){
                System.out.println("Bob: Whoa, chill out!");
            }else{
                System.out.println("Bob: whatever");
            }
            System.out.println("Would you like to continue talking to Bob? [y/n]");
            cont = sc.nextLine();
        }








    }
}
