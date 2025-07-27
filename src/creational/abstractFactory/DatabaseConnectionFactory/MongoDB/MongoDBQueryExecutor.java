package creational.abstractFactory.DatabaseConnectionFactory.MongoDB;

import creational.abstractFactory.DatabaseConnectionFactory.QueryExecutor;

public class MongoDBQueryExecutor implements QueryExecutor{

    public void execute(String query) {
        System.out.println("Executing MongoDB query: " + query);
    }

    
}
