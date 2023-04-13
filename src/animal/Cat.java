package src.animal;

public class Cat {
    private String name;
    private String noise;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public void makeNoise() {
        System.out.printf("%s says %s%n", name, talk());
    }

    public Cat() {};

    public Cat(String name, String noise) {
        this.name = name;
        this.noise = noise;
    }

    public static String talk() {
        int randomNum = (int) (Math.random()*4)+1;
        String[] phrases = {"Hello there", "Go away", "Get my food!", "Hurry up!"};
        return phrases[randomNum -1];
    }
}
