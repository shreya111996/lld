package factory.vehicleFactory;

public class Main {

    public static void main(String[] args) {

        Vehicle v1 = VehicleFactory.getVehicle("car");
        v1.start();
        System.out.println("Type: " + v1.getType());
        v1.stop();

        Vehicle v2 = VehicleFactory.getVehicle("bike");
        v2.start();
        System.out.println("Type: " + v2.getType());
        v2.stop();

    }

}