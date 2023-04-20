package src.util;

public class InputTest {
    public static void main(String[] args) {
        Input test = new Input();

//        test.getInt();
//
//        test.getDouble();
//        test.getDouble(1, 10);

        System.out.println(test.getBinary("Enter a binary number: "));
        System.out.println(test.getHex("Enter a hexadecimal number: "));


    }
}
