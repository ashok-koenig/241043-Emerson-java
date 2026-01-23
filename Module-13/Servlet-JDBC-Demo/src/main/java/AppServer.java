import jakarta.servlet.ServletRegistration;
import org.eclipse.jetty.ee11.servlet.ServletContextHandler;
import org.eclipse.jetty.server.Server;

public class AppServer {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);

        context.setContextPath("/");
        context.addServlet(RegisterServlet.class, "/register");
        context.addServlet(SaveServlet.class, "/save");

        server.setHandler(context);

        server.start();
        System.out.println("Server started at http://localhost:8080");
        server.join();
    }
}
