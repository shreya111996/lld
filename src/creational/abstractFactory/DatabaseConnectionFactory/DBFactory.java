package creational.abstractFactory.DatabaseConnectionFactory;

public interface DBFactory {

    DBConnection createConnection();
    QueryExecutor createQueryExecutor();
}
