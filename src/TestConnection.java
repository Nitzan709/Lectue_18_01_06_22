import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/cs";
    private static final String USENAME = "password";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(DATABASE_URL, USENAME, PASSWORD);
            System.out.println("connection establish");
        } catch (SQLException e) {
            System.out.println("there was a major problem!");
        }
    }
}
