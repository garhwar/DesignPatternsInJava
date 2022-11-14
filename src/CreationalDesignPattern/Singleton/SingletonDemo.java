package CreationalDesignPattern.Singleton;

public class SingletonDemo {

    public static void main(String args[])
    {
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();
        assert logger1 == logger2;
    }
}
