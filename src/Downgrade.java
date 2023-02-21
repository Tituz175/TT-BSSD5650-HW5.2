public class Downgrade implements Command {
    ElectronicDevice theDevice;

    public Downgrade(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.downgrade();
    }

    @Override
    public void undo() {
        theDevice.update();
    }
}
