package src.util;

public class InputTest {
    public static void main(String[] args) {
        Input test = new Input();

        System.out.println(test.getString());
        System.out.println(test.getString("Enter a word or words"));

        System.out.println(test.yesNo("Do you want to enter another?"));


        System.out.println(test.getInt(1,10));
        System.out.println(test.getInt("prompt"));

        System.out.println(test.getDouble(2.3,30.4));
        System.out.println(test.getDouble("prompt"));
    }
}
