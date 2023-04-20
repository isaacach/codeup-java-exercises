package src.students;

import src.students.Student;
import src.util.Input;

import java.util.HashMap;
import java.util.Set;

public class GradesApplication {
    public static void main(String[] args) {

        Student student1 = new Student("cole");
        student1.addGrade(76);
        student1.addGrade(34);
        student1.addGrade(91);
        Student student2 = new Student("mike");
        student2.addGrade(87);
        student2.addGrade(59);
        student2.addGrade(99);
        Student student3 = new Student("ike");
        student3.addGrade(67);
        student3.addGrade(78);
        student3.addGrade(88);
        Student student4 = new Student("don");
        student4.addGrade(13);
        student4.addGrade(97);
        student4.addGrade(23);
        HashMap<String, Student> students = new HashMap<>();
        students.put("cole8734", student1);
        students.put("mikey45", student2);
        students.put("mikenike23", student3);
        students.put("donny99", student4);
        Input input = new Input();

        userInput();
//        System.out.println("name, github username, grade average");
//        students.forEach((key, value)->{
//            System.out.printf("%s, %s, %.1f%n",students.get(key).getName(), key, students.get(key).getGradeAverage());
//        });
//        boolean user = input.yesNo("would you like to all of student's grades? [y/n]");
//        if (user) {
//            students.forEach((key, value)->{
//                System.out.printf(students.get(key).getName() + " => " + students.get(key).getGrades() + "\n");
//            });
//        } else {
//            System.out.println("have a good day");
//        }
    }
    public static void userInput(){
        Student student1 = new Student("cole");
        student1.addGrade(76);
        student1.addGrade(34);
        student1.addGrade(91);
        Student student2 = new Student("mike");
        student2.addGrade(87);
        student2.addGrade(59);
        student2.addGrade(99);
        Student student3 = new Student("ike");
        student3.addGrade(67);
        student3.addGrade(78);
        student3.addGrade(88);
        Student student4 = new Student("don");
        student4.addGrade(13);
        student4.addGrade(97);
        student4.addGrade(23);
        HashMap<String, Student> students = new HashMap<>();
        students.put("cole8734", student1);
        students.put("mikey45", student2);
        students.put("mikenike23", student3);
        students.put("donny99", student4);
        Input input = new Input();
        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:\n" +
                "\n" +
                "|cole8734| |mikey45| |mikenike23| |donny99|\n" +
                "\n" +
                "What student would you like to see more information on?\n" +
                "Or type ca to see the overall class average\n" +
                "Or type csv to see a csv of all students");
        String user = input.getString();
//        Set<String> userNames = students.keySet();
        if (user.equalsIgnoreCase("ca")) {
            double one = students.get("cole8734").getGradeAverage();
            double two = students.get("mikey45").getGradeAverage();
            double three = students.get("mikenike23").getGradeAverage();
            double four = students.get("donny99").getGradeAverage();
            System.out.printf("Class average => %.1f%n", (one + two + three + four) / 4);
            userInput();
        } else if (user.equalsIgnoreCase("csv")) {
            students.forEach((key, value)->{
                System.out.printf("%s, %s, %.1f%n",students.get(key).getName(), key, students.get(key).getGradeAverage());
            });
        } else if (!students.containsKey(user)){
            System.out.println("sorry, no student was found with that name");
            boolean cont = input.yesNo("would you like to try again?");
            if (cont) {
                userInput();
            }
        }
        System.out.printf("name: %s%ngithub username: %s%ncurrent average: %.1f%n", students.get(user).getName(), user, students.get(user).getGradeAverage());
        boolean cont = input.yesNo("would you like to search another student?");
        if (cont) {
            userInput();
        }
        System.out.println("have a nice day");

    }


}
