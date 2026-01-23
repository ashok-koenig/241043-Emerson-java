import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("""
                <html>
                <head>
                    <title>Employee List</title>
                </head>
                <body>
                    <h1>Employee List</h1>
                    <table border="1">
                        <tr>
                            <th>Name</th>
                            <th>Department</th>
                            <th>Salary</th>
                        </tr>
                """);

        try(Connection conn = DBUtil.getConnection()){
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM employees");
            while (rs.next()){
                resp.getWriter().println("<tr><td>"+rs.getString("emp_name")+
                        "</td><td>"+rs.getString("emp_dept")+
                        "</td><td>"+rs.getDouble("salary")+"</td></tr>");
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }

        resp.getWriter().println("""
                                    </table>
                                    <br>
                                    <a href="register">Register new employee</a>
                </body>
                </html>
                """);
    }
}
