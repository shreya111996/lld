package creational.abstractFactory.DatabaseConnectionFactory.MongoDB;

import creational.abstractFactory.DatabaseConnectionFactory.DBConnection;

public class MongoDBConnection implements DBConnection {
    
    public void connect() {
        System.out.println("Connected to MongoDB.");
    }
}
