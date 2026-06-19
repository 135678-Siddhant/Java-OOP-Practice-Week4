class Device {
    private String deviceName;

    public Device(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() { return deviceName; }

    public void operate() {
        System.out.println("Cycling status on core tracking hub module: " + deviceName);
    }
}

class Light extends Device {
    public Light(String deviceName) { super(deviceName); }

    @Override
    public void operate() {
        System.out.println("[Light Controller] Switching " + getDeviceName() + " to 100% illumination spectrum.");
    }
}

class Thermostat extends Device {
    private int temperature;

    public Thermostat(String deviceName, int temperature) {
        super(deviceName);
        this.temperature = temperature;
    }

    @Override
    public void operate() {
        System.out.println("[Climate Control] Adjusting environment via " + getDeviceName() + " to " + temperature + "°C.");
    }
}

class SecurityCamera extends Device {
    public SecurityCamera(String deviceName) { super(deviceName); }

    @Override
    public void operate() {
        System.out.println("[Security Systems] Spooling video drives. " + getDeviceName() + " capturing high-definition streaming data feeds.");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        Device[] homeAutomationNetwork = {
            new Light("Living Room Hue Array"),
            new Thermostat("Core HVAC Grid", 21),
            new SecurityCamera("Front Perimeter Gate Array")
        };

        System.out.println("Executing automated smart home routine sequences:\n");
        for (Device node : homeAutomationNetwork) {
            node.operate();
        }
    }
}