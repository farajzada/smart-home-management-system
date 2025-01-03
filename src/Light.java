public class Light extends Device {

    public Light(int id, String name, boolean status, DeviceType deviceType) {
        super(id, name, status, deviceType);
    }

    public void turnOn() {
        System.out.println("Light turned on");
    }

    public void turnOff() {
        System.out.println("Light turned off");
    }
}
