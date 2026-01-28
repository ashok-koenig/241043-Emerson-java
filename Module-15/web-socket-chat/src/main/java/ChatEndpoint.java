import jakarta.websocket.*;
import jakarta.websocket.server.ServerEndpoint;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

@ServerEndpoint("/chat")
public class ChatEndpoint {
    private static final Set<Session> sessions = new CopyOnWriteArraySet<>();

    @OnOpen
    public void onOpen(Session session) throws IOException{
        sessions.add(session);
        session.getBasicRemote().sendText("Welcome! You are connected.");
        broadcast("A new user joined the chat: "+ session.getId());
    }

    @OnMessage
    public void onMessage(String message, Session session) throws IOException{
        broadcast(session.getId() +" : "+ message);
    }

    @OnClose
    public void onClose(Session session){
        sessions.remove(session);
        broadcast("A user left the chat: "+ session.getId());
    }

    @OnError
    public void onError(Session session, Throwable t){
        System.out.println("Error: "+ t.getMessage());
    }

    private void broadcast(String message){
        sessions.forEach(s -> {
            try {
                s.getBasicRemote().sendText(message);
            } catch (IOException e) {
            }
        });
    }
}
