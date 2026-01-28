import org.eclipse.jetty.ee11.servlet.ServletContextHandler;
import org.eclipse.jetty.ee11.websocket.jakarta.server.config.JakartaWebSocketServletContainerInitializer;
import org.eclipse.jetty.server.Server;

public class ChatServer {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);

        context.setContextPath("/");

        context.addServlet(ChatServlet.class, "/client");

        JakartaWebSocketServletContainerInitializer.configure(context,
                (servletContext, serverContainer) -> {
            serverContainer.addEndpoint(ChatEndpoint.class);
                });

        server.setHandler(context);
        server.start();

        System.out.println("WebSocket Chat server running at ws://localhost:8080/chat");

        server.join();
    }
}
