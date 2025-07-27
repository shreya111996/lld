package creational.abstractFactory.DatabaseConnectionFactory.MongoDB;

import creational.abstractFactory.DatabaseConnectionFactory.DBConnection;
import creational.abstractFactory.DatabaseConnectionFactory.DBFactory;
import creational.abstractFactory.DatabaseConnectionFactory.QueryExecutor;

public class MongoDBFactory implements DBFactory {

    public DBConnection createConnection() {
        return new MongoDBConnection();
    }

    public QueryExecutor createQueryExecutor() {
        return new MongoDBQueryExecutor();
    }

}
