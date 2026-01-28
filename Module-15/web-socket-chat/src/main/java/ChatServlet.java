import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/client")
public class ChatServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("""
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <title>WebSocket Chat</title>
                </head>
                <body>
                    <h1>WebSocket Chat App</h1>
                    <div id="log"></div><br>
                
                    <input id="input" type="text" placeholder="Type message" />
                    <button onclick="sendMessage()">Send</button>
                
                <script>
                    const log = document.getElementById("log")
                    const ws = new WebSocket("ws://localhost:8080/chat");
                
                    ws.onmessage = (event) =>{
                        log.innerHTML +=`<div>${event.data}</div>`
                    }
                
                    function sendMessage(){
                    const msg = document.getElementById("input").value;
                    ws.send(msg);
                    document.getElementById("input").value="";
                    }
                </script>
                
                </body>
                </html>
                """);
    }
}
