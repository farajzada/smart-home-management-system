import java.util.List;

public class SmartHome implements Manageable{
    private List<User> users;
    private List<Device> devices;

    public SmartHome(List<User> users, List<Device> devices) {
        this.users = users;
        this.devices = devices;
    }

    public void addUser(User user) {
        users.add(user);
    }



    public void removeUser(User user) {
        users.remove(user);
    }



    public void addDevice(Device device) {
        devices.add(device);
    }



    public void removeDevice(Device device) {
        devices.remove(device);
    }



    public Device getDevice(int id) {
        for (Device device : devices) {
            if (device.getId() == id) {
                return device;
            }
        }
        return null;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
