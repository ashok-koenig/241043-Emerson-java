import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    private static final String URL = "jdbc:postgresql://localhost:5432/company";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";

    public static Connection getConnection() throws Exception{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
