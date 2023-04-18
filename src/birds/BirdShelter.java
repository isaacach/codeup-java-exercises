package src.birds;

public class BirdShelter {
    public static void main(String[] args) {
        Bird[] birds = new Bird[3];
        birds[0] = new Dove("dove");
        birds[1] = new Finch("finch");
        birds[2] = new Goose("goose");

        for (Bird bird : birds) {
            bird.makeNoise();
        }

    }
}
