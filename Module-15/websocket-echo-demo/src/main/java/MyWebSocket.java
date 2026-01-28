import jakarta.websocket.*;
import jakarta.websocket.server.ServerEndpoint;

@ServerEndpoint("/echo")
public class MyWebSocket {

    @OnOpen
    public void onOpen(Session session){
        System.out.println("Connected: "+ session.getId());
    }

    @OnMessage
    public void onMessage(String message, Session session) throws Exception{
        System.out.println("Received: "+ message);
        session.getBasicRemote().sendText("Echo: "+ message);
    }

    @OnClose
    public void onClose(Session session){
        System.out.println("Closed: "+ session.getId());
    }

    @OnError
    public void onError(Session session, Throwable t){
        System.out.println("Error: "+ t.getMessage());
    }
}
