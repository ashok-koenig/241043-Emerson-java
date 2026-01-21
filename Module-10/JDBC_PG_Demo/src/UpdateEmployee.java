import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateEmployee {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/company";
        String username = "postgres";
        String password = "postgres";
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            String query = "UPDATE employees set salary=12000 where id=3";
            int updatedRows = stmt.executeUpdate(query);
            System.out.println("Rows Updated: "+ updatedRows);
            stmt.close();
            conn.close();

        }catch (SQLException e){
            System.out.println("Error: "+ e);
        }
    }
}
