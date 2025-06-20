interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started.");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike started.");
    }
}

class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if (type == null) return null;
        if (type.equalsIgnoreCase("CAR")) return new Car();
        if (type.equalsIgnoreCase("BIKE")) return new Bike();
        return null;
    }
}

public class FactoryExample {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("CAR");
        if (car != null) car.start();

        Vehicle bike = VehicleFactory.getVehicle("BIKE");
        if (bike != null) bike.start();
    }
}
