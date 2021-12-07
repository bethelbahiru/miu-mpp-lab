package prob3;

public class VehicleFactory {
 private VehicleFactory(){}

    public static Vehicle getVehicle(String v) {
        Vehicle type = null;
        switch (v) {
            case "car":
                type = new Car();
                break;
            case "bus":
                type = new Bus();
                break;
            case "electric":
                type = new ElectricCar();
                break;
            case "truck":
                type = new Truck();
                break;

        }
        return type;
    }
}
