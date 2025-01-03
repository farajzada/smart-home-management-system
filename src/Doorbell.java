public class Doorbell extends Device {
    public Doorbell(int id, String name, boolean status, DeviceType deviceType) {
        super(id, name, status, deviceType);
    }

    @Override
    public void turnOn() {
        System.out.println("Doorbell (ID: " + getId() + ") is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Doorbell (ID: " + getId() + ") is now OFF.");
    }

    public void ring() {
        System.out.println("Doorbell ring on");

    }
}
