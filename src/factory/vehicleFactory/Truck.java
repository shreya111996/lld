package factory.vehicleFactory;

public class Truck implements Vehicle {

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
