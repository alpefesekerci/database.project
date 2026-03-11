public class DbConnection {
    public void openConnection(){
        System.out.println("Connection Opened");
    }
    public void closeConnection(){
        System.out.println("Connection Closed");
    }
    public void executeQuery(String query){
        System.out.println("Query Executed");
    }
}
