import org.eclipse.jetty.ee11.servlet.ServletContextHandler;
import org.eclipse.jetty.ee11.websocket.jakarta.server.config.JakartaWebSocketServletContainerInitializer;
import org.eclipse.jetty.server.Server;

public class AppServer {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        // Servlet Context
        ServletContextHandler context = new ServletContextHandler();
        context.setContextPath("/");

        // Initialize websocket container & register websocket endpoint

        JakartaWebSocketServletContainerInitializer.configure(context,
                (servletContext, serverContainer) -> {
            serverContainer.addEndpoint(MyWebSocket.class);
        });

        server.setHandler(context);

        server.start();
        System.out.println("Websocket running at ws://localhost:8080/echo");
        server.join();
    }
}
