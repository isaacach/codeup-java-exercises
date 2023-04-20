package src.students;

import src.students.Student;

public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student("cole");
        student1.addGrade(76);
        student1.addGrade(34);
        student1.addGrade(91);
        Student student2 = new Student("cole");
        student2.addGrade(87);
        student2.addGrade(59);
        student2.addGrade(99);
        Student student3 = new Student("cole");
        student3.addGrade(67);
        student3.addGrade(78);
        student3.addGrade(88);
        Student student4 = new Student("cole");
        student4.addGrade(13);
        student4.addGrade(97);
        student4.addGrade(23);
        System.out.println(student1.getGradeAverage());
        System.out.println(student2.getGradeAverage());
        System.out.println(student3.getGradeAverage());

    }
}
