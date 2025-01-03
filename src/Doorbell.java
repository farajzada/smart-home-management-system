public class Doorbell extends Device {
    public Doorbell(int id, String name, boolean status, DeviceType deviceType) {
        super(id, name, status, deviceType);
    }

    public void turnOn() {
        System.out.println("Doorbell turned on");
    }

    public void turnOff() {
        System.out.println("Doorbell turned off");
    }

    public void ring() {
        System.out.println("Doorbell ring on");

    }
}
