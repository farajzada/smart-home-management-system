public class Light extends Device {

    public Light(int id, String name, boolean status, DeviceType deviceType) {
        super(id, name, status, deviceType);
    }

    @Override
    public void turnOn() {
        System.out.println("Light (ID: " + getId() + ") is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light (ID: " + getId() + ") is now OFF.");
    }
}
