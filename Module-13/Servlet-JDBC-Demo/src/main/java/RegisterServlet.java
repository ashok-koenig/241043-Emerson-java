import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("""
                <html>
                <head>
                    <title>Register</title>
                </head>
                <body>
                    <h2>Employee Registration</h2>
                    <form method="post" action="save">
                        Employee Name: <input name="emp_name" required /> <br><br>
                        Employee Department: <input name="emp_dept" required /> <br><br>
                        Employee Salary: <input name="salary" required /> <br><br>
                        <button type="submit">Register</button>
                    </form>
                </body>
                </html>
                """);
    }
}
