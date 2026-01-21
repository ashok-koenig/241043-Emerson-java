import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateEmployee {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/company";
        String username = "postgres";
        String password = "postgres";
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO employees(emp_name, emp_dept, salary) values('Peter', 'IT', 5666)";
            int insertedRows = stmt.executeUpdate(query);
            System.out.println("Rows Inserted: "+ insertedRows);
            stmt.close();
            conn.close();

        }catch (SQLException e){
            System.out.println("Error: "+ e);
        }
    }
}
