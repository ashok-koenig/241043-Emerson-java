import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/lifecycle")
public class LifecycleServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet init() called - runs once when loaded");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service() handling request: "+ req.getMethod());
        super.service(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("Servlet Life Cycle Demo - check console logs!");
    }

    @Override
    public void destroy() {
        System.out.println("destroy() called - servlet shutting down.");
    }
}
