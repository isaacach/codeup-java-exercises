package src.vehicles;

public class Garage {
    Vehicle[] vehicles;

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public void alarmCascade() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getName() + " goes beeeeep beeeeeep");
        }
    }

}
