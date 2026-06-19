class SmartDevice {
    private String brand;
    private String model;

    public SmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }

    public void turnOn() {
        System.out.println("SmartDevice turning on...");
    }

    public void turnOff() {
        System.out.println("SmartDevice turning off...");
    }
}

class SmartPhone extends SmartDevice {
    public SmartPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " Smartphone: Booting OS, lighting up screen.");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " Smartphone: Saving state and shutting down.");
    }
}

class SmartWatch extends SmartDevice {
    public SmartWatch(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " Smartwatch: Always-On Display active, syncing sensors.");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " Smartwatch: Powering down, turning off health sensors.");
    }
}

public class SmartDevices {
    public static void main(String[] args) {
        SmartDevice[] devices = {
            new SmartPhone("Apple", "iPhone 15"),
            new SmartWatch("Samsung", "Galaxy Watch 6")
        };

        for (SmartDevice device : devices) {
            device.turnOn();
            device.turnOff();
            System.out.println();
        }
    }
}