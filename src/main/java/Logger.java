import java.util.Date;

public class Logger {

    protected int num = 1;
    private static Logger instance;

    private Logger() {
    }
    Date date = new Date();

    public void log(String msg) {
        System.out.println("[" + date + "]" + "[" + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }


}
