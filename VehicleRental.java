class Vehicle {
    private String plateNumber;
    private double baseRate;

    public Vehicle(String plateNumber, double baseRate) {
        this.plateNumber = plateNumber;
        this.baseRate = baseRate;
    }

    public String getPlateNumber() { return plateNumber; }
    public double getBaseRate() { return baseRate; }

    public double calculateRental(int days) {
        return baseRate * days;
    }
}

class Car extends Vehicle {
    public Car(String plateNumber, double baseRate) {
        super(plateNumber, baseRate);
    }
    // Charges baseRate * days exactly
}

class Truck extends Vehicle {
    private double loadFee;

    public Truck(String plateNumber, double baseRate, double loadFee) {
        super(plateNumber, baseRate);
        this.loadFee = loadFee;
    }

    @Override
    public double calculateRental(int days) {
        return (getBaseRate() * days) + loadFee;
    }
}

class Bike extends Vehicle {
    public Bike(String plateNumber, double baseRate) {
        super(plateNumber, baseRate);
    }

    @Override
    public double calculateRental(int days) {
        return getBaseRate(); // Fixed flat rate regardless of duration
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        Vehicle car = new Car("CAR-123", 50);
        Vehicle truck = new Truck("TRK-789", 100, 250);
        Vehicle bike = new Bike("BIK-456", 20);

        System.out.println("Car Rental (5 Days): $" + car.calculateRental(5));
        System.out.println("Truck Rental (5 Days): $" + truck.calculateRental(5));
        System.out.println("Bike Rental (5 Days): $" + bike.calculateRental(5));
    }
}