public abstract class Device {
    public enum DeviceType {
        LIGHT,
        THERMOSTAT,
        CAMERA,
        DOORBELL
    }

    private int id;
    private String name;
    private boolean status;
    private DeviceType deviceType;


    public Device(int id, String name, boolean status, DeviceType deviceType) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.deviceType = deviceType;
    }


    public abstract void turnOn();

    public abstract void turnOff();


    public boolean getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }
}
