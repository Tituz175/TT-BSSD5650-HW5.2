import java.util.ArrayList;
import java.util.List;

public class UniversalRemote {
    private List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();

    public void registerDevice(ElectronicDevice device) {
        allDevices.add(device);
    }

    public List<ElectronicDevice> getAllDevices() {
        return allDevices;
    }
}
