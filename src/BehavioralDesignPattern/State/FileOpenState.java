package BehavioralDesignPattern.State;

import BehavioralDesignPattern.Command.File;

public class FileOpenState extends State {

    public FileOpenState(File file) {
        super(file);
        file.open();
    }

    @Override
    public void onOpen() {
        System.out.println("Prompt for read, write or append to file");
    }

    @Override
    public void onClose() {
        throw new IllegalArgumentException("Illegal state: File is open");
    }
}
