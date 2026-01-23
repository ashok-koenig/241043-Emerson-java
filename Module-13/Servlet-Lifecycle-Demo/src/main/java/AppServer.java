import jakarta.servlet.ServletRegistration;
import org.eclipse.jetty.ee11.servlet.ServletContextHandler;
import org.eclipse.jetty.server.Server;

public class AppServer {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);

        context.setContextPath("/");
        context.addServlet(LifecycleServlet.class, "/lifecycle");
        context.addServlet(ServletContextDemo.class, "/context");

        // Register Servlet
        ServletRegistration.Dynamic registration =
                context.addServlet(ConfigServletDemo.class, "/config")
                                .getRegistration();

        // Add initial parameters / values
        registration.setInitParameter("appName", "Demo Application");
        registration.setInitParameter("appVersion", "1.0.0");

        server.setHandler(context);

        server.start();
        System.out.println("Server started at http://localhost:8080/lifecycle");
        server.join();
    }
}
