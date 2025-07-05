package singleton.Logger;

public class Logger {

    private static Logger logObj;

    private Logger() {

    }

    public static Logger getInstance() {

        if (logObj == null) {
            synchronized(Logger.class) {
                if (logObj == null) {
                    logObj = new Logger();
                    return logObj;
                }
            }
        }

        return logObj;
    }

    public void logMessage(String msg) {

        System.out.println("[" + System.currentTimeMillis() + "] " + msg);

        /*
        Formatted Date & Time
        
        public String getFormattedTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(formatter);
        }
        */

    }
    
}
