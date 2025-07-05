package singleton;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConfigurationManager {

    private static volatile ConfigurationManager configObj;
    private Map<String, Integer> keyValue = new ConcurrentHashMap<>(); // private field, but not static;
                                                                       // ConcurrentHashMap for thread safety

    private ConfigurationManager() {

        keyValue.put("ConfigA", 100);
        keyValue.put("ConfigB", 200);
        System.out.println("ConfigurationManager instance created and configurations loaded.");

    }

    public static ConfigurationManager getInstance() {

        if (configObj == null) {
            synchronized (ConfigurationManager.class) {
                if (configObj == null) { // double null check;
                                         // check again after entering synchronized block if any other thread has
                                         // already created the object
                    configObj = new ConfigurationManager();
                    return configObj;
                }
            }
        }
        return configObj;
    }

    public int retrieveValue(String str) {

        if (keyValue.containsKey(str)) {
            return keyValue.get(str);
        }

        throw new IllegalArgumentException("Configuration key not found: " + str);
    }

    // Only allow loading from file/environment - not runtime modification
    private void loadFromFile(String filePath) {
        // Load configurations from external source
        // This would be called only during initialization
    }

}
