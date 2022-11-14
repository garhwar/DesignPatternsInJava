package CreationalDesignPattern.Singleton;

public class Logger {

    private static Logger logger = null;

    private String logFile;

    private Logger() {
        this.logFile = "logfile.txt";
    }

    public static Logger getLogger() {
        if(logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}
