package creational.singleton.databaseConnectionSingleton;

public class DatabaseConnector {

    private static volatile DatabaseConnector dbConnectorObj;

    private DatabaseConnector() {

        System.out.println("Database Connection Object Created");
    }

    public static DatabaseConnector getInstance() {

        if (dbConnectorObj == null) {

            synchronized (DatabaseConnector.class) {
                if (dbConnectorObj == null) {
                    dbConnectorObj = new DatabaseConnector();
                    return dbConnectorObj;
                }
            }
        }

        return dbConnectorObj;
    }

}

class DatabaseConnectorTest {

    public static void main(String[] args) {

        DatabaseConnector dbConnectorObj1 = DatabaseConnector.getInstance();
        DatabaseConnector dbConnectorObj2 = DatabaseConnector.getInstance();
        DatabaseConnector dbConnectorObj3 = DatabaseConnector.getInstance();

        System.out.println("Same instance: " + (dbConnectorObj1 == dbConnectorObj2));

        System.out.println(dbConnectorObj1);
        System.out.println(dbConnectorObj2);
        System.out.println(dbConnectorObj3);
    }
}
