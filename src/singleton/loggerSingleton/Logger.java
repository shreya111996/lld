package singleton.loggerSingleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static Logger logObj;

    private Logger() {

    }

    public static Logger getInstance() {

        if (logObj == null) {
            synchronized (Logger.class) {
                if (logObj == null) {
                    logObj = new Logger();
                    return logObj;
                }
            }
        }

        return logObj;
    }

    public void logMessage(String msg) {

        System.out.println("[" + getFormattedTimestamp() + "] " + msg);

    }

    public String getFormattedTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }

}

class LoggerTest {

    public static void main(String[] args) {

        Logger obj1 = Logger.getInstance();
        Logger obj2 = Logger.getInstance();
        Logger obj3 = Logger.getInstance();

        obj1.logMessage("Msg from Obj1");
        obj2.logMessage("Msg from Obj2");
        obj3.logMessage("Msg from Obj3");

        System.out.println(obj1 == obj2); // to check Singleton pattern violation
    }

}
