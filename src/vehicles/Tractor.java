package src.vehicles;

public class Tractor extends Vehicle{
    public void makeNoise() {
        System.out.println(this.getName() + " goes blub blub blub");
    }

    public void breakingDownNoise() {
        super.makeNoise();
        System.out.println(this.getName() + " goes poof poof");
    }
}
