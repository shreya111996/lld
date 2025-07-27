package creational.abstractFactory.DatabaseConnectionFactory;

import creational.abstractFactory.DatabaseConnectionFactory.MongoDB.MongoDBFactory;
import creational.abstractFactory.DatabaseConnectionFactory.MySQL.MySQLFactory;

public class DBClient {

    private DBConnection connection;
    private QueryExecutor executor;

    public DBClient (DBFactory factory) {

        this.connection = factory.createConnection();
        this.executor = factory.createQueryExecutor();
    }

    public void doWork (String query) {
        connection.connect();
        executor.execute(query);
    }

    public static void main(String[] args) {
        
        DBFactory mysqlFactory = new MySQLFactory();
        DBClient client1 = new DBClient(mysqlFactory);
        client1.doWork("SELECT * FROM Users");

        DBFactory mongoFactory = new MongoDBFactory();
        DBClient client2 = new DBClient(mysqlFactory);
        client2.doWork("{ find: 'users' }");

    }
    
}
