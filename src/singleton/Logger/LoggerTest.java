package singleton.Logger;

public class LoggerTest {

    public static void main (String[] args) {

        Logger obj1 = Logger.getInstance();
        Logger obj2 = Logger.getInstance();
        Logger obj3 = Logger.getInstance();

        obj1.logMessage("Msg from Obj1");
        obj2.logMessage("Msg from Obj2");
        obj3.logMessage("Msg from Obj3");

        System.out.println(obj1 == obj2); // to check Singleton pattern violation
    }

}
