package src;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 7, 3, 4, -6, 5};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        Person people1 = new Person("isaac");
        Person people2= new Person("kyle");
        Person people3 = new Person("dan");
        Person person = new Person("mike");

        Person[] people = {people1, people2, people3};
        Person[] newPeople = ArraysExercises.addPerson(people, person);

        for (Person pers : people) {
            System.out.println(pers.getName());
        }

        for (Person pers : newPeople) {
            System.out.println(pers.getName());
        }

        String[] animals = {"cat", "dog", "lizard", "hamster"};

        for (String animal : animals) {
            System.out.printf("I like %ss%n", animal);
        }
    }
    public static Person[] addPerson(Object[] people, Object person) {
        Person[] copy = (Person[]) Arrays.copyOf(people, people.length + 1);
        copy[people.length] = (Person) person;
        return copy;
    }
}
