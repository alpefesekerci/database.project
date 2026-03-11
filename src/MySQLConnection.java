public class MySQLConnection extends DbConnection{

    public void openConnection(){
        System.out.println("MySQL Connection Opened");
    }

    public void closeConnection(){
        System.out.println("MySQL Connection Closed");
    }

    public void executeQuery(String query){
        System.out.println("MySQL Query Executed");
    }
}
