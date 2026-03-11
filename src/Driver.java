import java.util.Scanner;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        DbConnection connection = (DbConnection) Class.forName(args[0]).newInstance();
        connection.openConnection();
        connection.executeQuery("SELECT * FROM student");
        connection.closeConnection();
    }

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Database Type (1 for MySQL, 2 for MsSQL, 3 for Oracle): ");
        int dbType = scanner.nextInt();

        DbConnection dbConnection = null;

        switch (dbType) {
            case 1:
                dbConnection = new MySQLConnection();
                break;
            case 2:
                dbConnection = new MsSQLConnection();
                break;
            case 3:
                dbConnection = new OracleDbConnection();
                break;
            default:
                System.out.println("Invalid database type.");
        }
        if (dbConnection != null) {
            dbConnection.openConnection();
            dbConnection.executeQuery("SELECT * FROM users");
            dbConnection.closeConnection();
            System.out.println("Operation completed successfully.");
            scanner.close();
            System.exit(0);
        }
    }
        */
}


