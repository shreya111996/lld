package creational.abstractFactory.DatabaseConnectionFactory.MySQL;

import creational.abstractFactory.DatabaseConnectionFactory.DBConnection;

public class MySQLConnection implements DBConnection {

    @Override
    public void connect() {
        
        System.out.println("Connected to MySQL Database.");
    }
    
    
}
