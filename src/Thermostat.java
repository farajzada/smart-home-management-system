public class Thermostat extends Device {
    public Thermostat(int id, String name, boolean status, DeviceType deviceType) {
        super(id, name, status, deviceType);
    }

    public void turnOn() {
        System.out.println("Thermostat is on");
    }

    public void turnOff() {
        System.out.println("Thermostat is off");
    }

    public void setTemperature(int temperature) {
        System.out.println("Thermostat set temperature: " + temperature);
    }
}
