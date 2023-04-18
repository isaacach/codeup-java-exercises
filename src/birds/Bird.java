package src.birds;

public class Bird {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println(this.name + " says tweet tweet");
    }

    public void layEggs() {
        System.out.println("laying an egg...");
    }

    public Bird(String name) {
        this.name = name;
    }
}
