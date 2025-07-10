package factory.vehicleFactory;

public class Bike implements Vehicle {

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

