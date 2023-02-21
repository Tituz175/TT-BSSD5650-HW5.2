public class Main {
    public static void main(String[] args) {
//        UniversalRemote remote = new UniversalRemote();
//        remote.registerDevice(new Television());
//        remote.registerDevice(new Radio());

//        DeviceButton offPressed = new DeviceButton(new TurnItAllOff(remote.getAllDevices()));
//        offPressed.press();
//
//        ElectronicDevice TV = new Television();
//        DeviceButton updatePressed = new DeviceButton(new Update(TV));

//        updatePressed.press();

//        DeviceButton updateAllPressed = new DeviceButton(new UpdateItAll(remote.getAllDevices()));
//        updateAllPressed.press();

//        updatePressed.pressUndo();

        Command[] allUpdates = {new Update(new Television()), new Update(new Radio())};
        Command updateAllCommand = new MacroCommand(allUpdates);
        DeviceButton updateAllPressed = new DeviceButton(updateAllCommand);
        updateAllPressed.press();
        updateAllPressed.pressUndo();

        ElectronicDevice TV = TVRemote.getDevice();
        Command[] tvStuff = {new TurnTVOn(TV), new TurnTVUp(TV), new Update(TV)};
        Command tvCommands = new MacroCommand(tvStuff);
        DeviceButton TVPrefPressed = new DeviceButton(tvCommands);
        TVPrefPressed.press();
    }
}