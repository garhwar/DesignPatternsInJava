package BehavioralDesignPattern.Command;

public class OpenFileCommand implements Command {

    private File file;

    public OpenFileCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        this.file.open();
        this.file.close();
    }
}
