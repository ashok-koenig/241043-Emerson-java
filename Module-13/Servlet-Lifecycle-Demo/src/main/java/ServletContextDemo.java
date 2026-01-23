import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/context")
public class ServletContextDemo extends HttpServlet {
    @Override
    public void init() throws ServletException {
        ServletContext context = getServletContext();
        context.setAttribute("globalMessage", "Hello from ServletContext!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        String msg = context.getAttribute("globalMessage").toString();
        resp.setContentType("text/plain");
        resp.getWriter().println("ServletContext Demo");
        resp.getWriter().println("Global message: "+ msg);
    }
}
