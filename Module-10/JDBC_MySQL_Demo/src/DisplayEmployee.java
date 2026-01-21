import java.sql.*;

public class DisplayEmployee {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String password = "root";
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
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
