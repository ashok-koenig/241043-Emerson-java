import java.sql.*;

public class DisplayEmployee {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/company";
        String username = "postgres";
        String password = "postgres";
        try{
            // Establish connection with database
            Connection conn = DriverManager.getConnection(url, username, password);
            // Create statement to execute / update query
            Statement stmt = conn.createStatement();
            // Get the result from executed query
            ResultSet rs = stmt.executeQuery("Select * from employees");
            System.out.println("ID \t Name \t Department \t Salary");
            while (rs.next()){
                System.out.println(rs.getInt("id") + "\t"
                                    + rs.getString("emp_name") + "\t"
                                    + rs.getString("emp_dept") + "\t"
                                    + rs.getDouble("salary"));
            }
            stmt.close();
            conn.close();

        }catch (SQLException e){
            System.out.println("Error: "+ e);
        }
    }
}
