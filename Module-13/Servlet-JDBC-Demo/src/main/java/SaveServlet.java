import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet("/save")
public class SaveServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String emp_name= req.getParameter("emp_name");
        String emp_dept = req.getParameter("emp_dept");
        String salary = req.getParameter("salary");
        try(Connection conn=DBUtil.getConnection()){
            String sql = "INSERT INTO employees(emp_name, emp_dept, salary) values(?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, emp_name);
            ps.setString(2, emp_dept);
            ps.setDouble(3, Double.parseDouble(salary));

            ps.executeUpdate();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        resp.setContentType("text/html");
        resp.getWriter().println("""
                <html>
                <head>
                    <title>Employee saved successfully</title>
                </head>
                <body>
                    <h1>Employee saved successfully</h1>
                    <a href="list">View Employee list</a>
                </body>
                </html>
                """);
    }
}
