package src.rpg;

public class RPG {

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter();
        fighter1.setName("Arata");
        fighter1.setHitPoints(20);
        fighter1.setMaxDamage(13);
        fighter1.printStats();

        Fighter fighter2 = new Fighter();
        fighter2.setName("Sozalix");
        fighter2.setHitPoints(27);
        fighter2.setMaxDamage(17);
        fighter2.printStats();

        Fighter fighter3 = new Fighter("Rodan", 34, 22);
        fighter3.printStats();
    }
}
