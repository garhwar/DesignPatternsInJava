package BehavioralDesignPattern.Command;

public class SaveFileCommand implements Command {

    private File file;

    public SaveFileCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        this.file.open();
        this.file.save();
        this.file.close();
    }
}
