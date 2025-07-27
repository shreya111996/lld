package creational.abstractFactory.DatabaseConnectionFactory.MySQL;

import creational.abstractFactory.DatabaseConnectionFactory.DBConnection;
import creational.abstractFactory.DatabaseConnectionFactory.DBFactory;
import creational.abstractFactory.DatabaseConnectionFactory.QueryExecutor;

public class MySQLFactory implements DBFactory {

    public DBConnection createConnection() {
        return new MySQLConnection();
    }

    public QueryExecutor createQueryExecutor() {
        return new MySQLQueryExecutor();
    }


}
