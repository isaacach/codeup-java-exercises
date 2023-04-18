package src.vehicles;

public class VehicleTest {
    public static void main(String[] args) {
        Tractor tractor = new Tractor();
        tractor.setName("john deer");
        System.out.println(tractor.getName());
        tractor.makeNoise();
        tractor.breakingDownNoise();

        Car car = new Car();
        car.makeNoise();
    }
}
