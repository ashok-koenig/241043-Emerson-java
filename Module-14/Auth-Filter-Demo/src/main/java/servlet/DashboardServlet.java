package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = (String) req.getSession().getAttribute("user");
        resp.setContentType("text/html");
        resp.getWriter().println("""
                <html>
                    <head>
                        <title>Dashboard</title>
                    </head>
                    <body>
                        <h2>Dashboard</h2>
                        <p>Welcome, %s</p>
                    </body>
                </html>
                """.formatted(user));
    }
}
