package singleton;

public class ConfigurationManagerTest {

    public static void main(String[] args) {
        
        ConfigurationManager configObj1 = ConfigurationManager.getInstance(); // call getInstance method on className
        ConfigurationManager configObj2 =ConfigurationManager.getInstance();
        ConfigurationManager configObj3 = ConfigurationManager.getInstance();

        System.out.println("Same instance: " + (configObj1 == configObj2));

        System.out.println(configObj1.retrieveValue("ConfigA"));
        System.out.println(configObj2.retrieveValue("ConfigB"));
        // System.out.println(configObj3.retrieveValue("MB"));

    }

}
