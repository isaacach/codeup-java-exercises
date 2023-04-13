package src.animal;

public class DoSomething {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Tinkerbell");
//        cat.setNoise("meow");
        cat.makeNoise();

        Cat cat1 = new Cat();
        cat1.setName("Alex");
//        cat1.setNoise("meeeeoooowwww");
        cat1.makeNoise();

        Cat cat2 = new Cat("Kitty", "mauw");
        cat2.makeNoise();

    }
}
