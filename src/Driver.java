public class Driver {
    public static void main(String[] args) {
        DbConnection dbConnection = new OracleDbConnection();
        dbConnection.openConnection();
        dbConnection.executeQuery("SELECT * FROM student");
        dbConnection.closeConnection();
    }
}
