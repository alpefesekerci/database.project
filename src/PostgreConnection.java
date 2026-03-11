public class PostgreConnection extends DbConnection{

    public void openConnection(){
        System.out.println("Postgre Connection Opened");
    }
    public void closeConnection(){
        System.out.println("Postgre Connection Closed");
    }
    public void executeQuery(String query){
        System.out.println("Postgre Query Executed");
    }
}
