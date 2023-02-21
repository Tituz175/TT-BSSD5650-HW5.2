public class Update implements Command{

    ElectronicDevice theDevice;

    public Update(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }
    @Override
    public void execute() {
        theDevice.update();
    }

    @Override
    public void undo() {
    theDevice.downgrade();
    }
}
