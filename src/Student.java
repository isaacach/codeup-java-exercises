package src;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return name;
    };

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage(){
        return (grades.stream().mapToInt(i -> i).sum()) / grades.size();
    };

    public ArrayList<Integer> getGrades() {
        return grades;
    };

}
