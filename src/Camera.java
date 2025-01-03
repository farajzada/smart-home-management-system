public class Camera extends Device {
    public Camera(int id, String name, boolean status, DeviceType deviceType) {
        super(id, name, status, deviceType);
    }

    public void turnOn() {
        System.out.println("Turning on camera");
    }

    public void turnOff() {
        System.out.println("Turning off camera");
    }

    public void startRecording() {
        System.out.println("Starting recording");
    }

    public void stopRecording() {
        System.out.println("Stopping recording");
    }
}
