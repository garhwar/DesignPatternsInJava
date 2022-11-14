package BehavioralDesignPattern.Command;

public class CommandDemo {

    public static void main (String[] args)
    {
        // Execute save file command
        File file = new File();
        Command save = new SaveFileCommand(file);
        save.execute();

    }
}
