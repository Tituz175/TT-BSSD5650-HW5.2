import java.util.List;

public class UpdateItAll implements Command{
    List<ElectronicDevice> theDevices;

    public UpdateItAll(List<ElectronicDevice> newDevices) {
        theDevices = newDevices;
    }
    @Override
    public void execute() {
        for (ElectronicDevice device : theDevices) {
            device.update();
        }
    }

    @Override
    public void undo() {
        for (ElectronicDevice device : theDevices) {
            device.downgrade();
        }
    }
}
