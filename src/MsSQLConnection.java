public class MsSQLConnection extends DbConnection{
        public void openConnection(){
            System.out.println("MsSQL Connection Opened");
        }

        public void closeConnection(){
            System.out.println("MsSQL Connection Closed");
        }

        public void executeQuery(String query){
            System.out.println("MsSQL Query Executed");
        }
}
