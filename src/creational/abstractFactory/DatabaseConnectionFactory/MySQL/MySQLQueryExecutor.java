package creational.abstractFactory.DatabaseConnectionFactory.MySQL;

import creational.abstractFactory.DatabaseConnectionFactory.QueryExecutor;

public class MySQLQueryExecutor implements QueryExecutor {

    public void execute(String query) {
        
        System.out.println("Executing MySQL query: " + query);
    }
}
