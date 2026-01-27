package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String error = req.getParameter("error");
        resp.getWriter().println("""
                <html>
                    <head>
                        <title>Login Page</title>
                    </head>
                    <body>
                        <h2>Login</h2>
                        %s
                        <form method="post" action="login">
                        Username: <input type="text" name="username" /> <br><br>
                        Password: <input type="password" name="password" /> <br><br>
                        <button type="submit">Login</button>
                        </form>
                    </body>
                </html>
                """.formatted(error !=null ? "<p style='color: red'>Invalid credentials</p>" : ""
        ));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if("admin".equals(username) && "admin123".equals(password)){
            HttpSession session = req.getSession(true);
            session.setAttribute("user", username);
            resp.sendRedirect("dashboard");
        }else{
            resp.sendRedirect("login?error=true");
        }
    }
}
