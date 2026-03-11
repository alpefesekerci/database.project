public class OracleDbConnection extends DbConnection{

    public void openConnection(){
        System.out.println("Oracle Connection Opened");
    }

    public void closeConnection(){
        System.out.println("Oracle Connection Closed");
    }

    public void executeQuery(String query){
        System.out.println("Oracle Query Executed");
    }
}
