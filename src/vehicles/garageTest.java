package src.vehicles;

public class garageTest {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.vehicles = new Vehicle[3];
        garage.vehicles[0] = new Car();
        garage.vehicles[0].setName("toyota");
        garage.vehicles[1] = new Tractor();
        garage.vehicles[1].setName("john deer");
        garage.vehicles[2] = new Vehicle();
        garage.vehicles[2].setName("huffy");

        garage.alarmCascade();
    }
}
