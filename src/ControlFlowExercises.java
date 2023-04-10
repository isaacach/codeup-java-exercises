package src;


import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }

//        int j = 100;
//        do {
//            System.out.println(j);
//            j -= 5;
//        } while (j >=-10);

//        int q = 2;
//        do {
//            System.out.println(q);
//            q = (int) Math.pow(q, 2);
//        } while (q < 1000000);
//
//        for (int w = 2; w < 1000000; w = (int) Math.pow(w, 2)) {
//            System.out.println(w);
//        }

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner scanner = new Scanner(System.in);
//        System.out.println("What number would you like to go up to?");
//        int num = scanner.nextInt();
//        System.out.println("Here is your table! \n");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for (int i = 1; i <= num; i++) {
//            int squared = (int) Math.pow(i,2);
//            int cubed = (int) Math.pow(i,3);
//            if (squared > 9) {
//                System.out.printf("%d      | %d      | %d%n", i, squared, cubed);
//            } else {
//                System.out.printf("%d      | %d       | %d%n", i, squared, cubed);
//            }
//        }
        String cont = "y";
        do {
            System.out.println("What was your grade between 0 and 100?");
            int grade = scanner.nextInt();
            if (grade < 60) {
                System.out.println("Your grade is F");
            } else if (grade > 59 && grade < 67) {
                System.out.println("Your grade is D");
            } else if (grade > 66 && grade < 80) {
                System.out.println("Your grade is C");
            } else if (grade > 79 && grade < 88) {
                System.out.println("Your grade is B");
            } else if (grade > 87 && grade <= 100) {
                System.out.println("Your grade is A");
            }
            System.out.println("Would you like to continue? [y/n]");
            cont = scanner.next();
            if (cont.equalsIgnoreCase("n")) {
                System.out.println("Have a nice day!");
            }
        } while (cont.equalsIgnoreCase("y"));

    }
}
