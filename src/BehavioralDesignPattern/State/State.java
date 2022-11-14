package BehavioralDesignPattern.State;

import BehavioralDesignPattern.Command.File;

public abstract class State {
    File file;

    State(File file) {
        this.file = file;
    }

    public abstract void onOpen();
    public abstract void onClose();
}
