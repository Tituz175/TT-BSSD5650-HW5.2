public class MacroCommand implements Command {
    Command[] mCommands;

    public MacroCommand(Command[] commands) {
        mCommands = commands;
    }

    @Override
    public void execute() {
        for (Command command : mCommands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (int i = mCommands.length - 1; i >= 0; i--) {
            mCommands[i].undo();
        }
    }
}
