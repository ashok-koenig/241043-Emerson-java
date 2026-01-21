import java.sql.*;

public class CreateEmployee {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String password = "root";
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
