import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/config")
public class ConfigServletDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig config = getServletConfig();
        String appName = config.getInitParameter("appName");
        String appVersion = config.getInitParameter("appVersion");

        resp.getWriter().println("ServletConfig Demo");
        resp.getWriter().println("App Name: "+ appName);
        resp.getWriter().println("App Version: "+ appVersion);
    }
}
