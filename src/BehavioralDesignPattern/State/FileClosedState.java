package BehavioralDesignPattern.State;

import BehavioralDesignPattern.Command.File;

public class FileClosedState extends State {

    public FileClosedState(File file) {
        super(file);
        file.close();
    }

    @Override
    public void onClose() {
        file.save();
        System.out.println("Closing file and clearing resources");
    }

    @Override
    public void onOpen() {
        throw new IllegalArgumentException("Illegal state: File is open");
    }
}
