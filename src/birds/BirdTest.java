package src.birds;

public class BirdTest {
    public static void main(String[] args) {
        Dove dove = new Dove("dove");
        dove.makeNoise();
        dove.layEggs();

        Finch finch = new Finch("finch");
        finch.makeNoise();

        Goose goose = new Goose("goose");
        goose.makeNoise("honk honk");
    }
}
