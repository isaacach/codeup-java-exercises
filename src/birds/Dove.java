package src.birds;

public class Dove extends Bird{
    public Dove(String name) {
        super(name);
    }

    public void makeNoise() {
        super.makeNoise();
        System.out.println(this.getName() + " says ack-squeek");
    }

}
