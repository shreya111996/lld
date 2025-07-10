package factory.vehicleFactory;

public class Car implements Vehicle {

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

