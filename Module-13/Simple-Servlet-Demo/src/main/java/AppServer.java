import org.eclipse.jetty.ee11.servlet.ServletContextHandler;
import org.eclipse.jetty.server.Server;

public class AppServer {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);

        context.setContextPath("/");
        context.addServlet(HelloServlet.class, "/hello");

        server.setHandler(context);

        server.start();
        System.out.println("Server started at http://localhost:8080/hello");
        server.join();
    }
}
