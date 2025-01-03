public class Camera extends Device {
    public Camera(int id, String name, boolean status, DeviceType deviceType) {
        super(id, name, status, deviceType);
    }

    @Override
    public void turnOn() {
        System.out.println("Camera (ID: " + getId() + ") is now ON and recording.");
    }

    @Override
    public void turnOff() {
        System.out.println("Camera (ID: " + getId() + ") is now OFF and stopped recording.");
    }

    public void startRecording() {
        System.out.println("Starting recording");
    }

    public void stopRecording() {
        System.out.println("Stopping recording");
    }
}
