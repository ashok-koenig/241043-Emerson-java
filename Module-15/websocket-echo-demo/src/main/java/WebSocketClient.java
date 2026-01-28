import jakarta.websocket.*;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@ClientEndpoint
public class WebSocketClient {

    @OnOpen
    public void onOpen(Session session) throws Exception{
        System.out.println("Client connected");
        session.getBasicRemote().sendText("Hello Server!");
    }

    @OnMessage
    public void onMessage(String message){
        System.out.println("Received from server: "+ message);
    }

    @OnClose
    public void onClose(){
        System.out.println("Client closed");
    }

    @OnError
    public void onError(Throwable t){
        System.out.println("Client Error: "+ t.getMessage());
    }

    public static void main(String[] args) throws URISyntaxException, DeploymentException, IOException {
        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        container.connectToServer(WebSocketClient.class, new URI("ws://localhost:8080/echo"));
    }
}
