public class Thermostat extends Device {
    public Thermostat(int id, String name, boolean status, DeviceType deviceType) {
        super(id, name, status, deviceType);
    }

    @Override
    public void turnOn() {
        System.out.println("Thermostat (ID: " + getId() + ") is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat (ID: " + getId() + ") is now OFF.");
    }

    public void setTemperature(int temperature) {
        System.out.println("Thermostat set temperature: " + temperature);
    }
}
