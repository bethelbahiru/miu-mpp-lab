package prob3;

public class Main {
    public static void main(String[] args) {
        String[] vehicles = new String[]{"car", "bus", "electric", "truck"};

        for (String string : vehicles) {
            Vehicle v = VehicleFactory.getVehicle(string);
            v.startEngine();
        }
    }
}
