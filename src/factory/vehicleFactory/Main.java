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

class VehicleFactory {

    public static Vehicle getVehicle(String type) {

        if (type == null) {
            return null;
        }

        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            case "truck":
                return new Truck();
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }

}

interface Vehicle {

    void start();

    void stop();

    String getType();

}

class Car implements Vehicle {

    @Override
    public void start() {

        System.out.println("Starting the Car....");

    }

    @Override
    public void stop() {

        System.out.println("Stopping the Car...");

    }

    @Override
    public String getType() {
        return "Car";
    }

}

class Bike implements Vehicle {

    @Override
    public void start() {

        System.out.println("Starting the Bike....");

    }

    @Override
    public void stop() {

        System.out.println("Stopping the Bike...");

    }

    @Override
    public String getType() {
        return "Bike";
    }

}

class Truck implements Vehicle {

    @Override
    public void start() {

        System.out.println("Starting the Truck....");

    }

    @Override
    public void stop() {

        System.out.println("Stopping the Truck...");

    }

    @Override
    public String getType() {
        return "Truck";
    }

}
