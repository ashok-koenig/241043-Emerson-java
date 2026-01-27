package listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class ActiveUserListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {

        ServletContext context = se.getSession().getServletContext();

        Integer count = (Integer) context.getAttribute("activeUsers");
        if(count == null){
            count =0;
        }

        context.setAttribute("activeUsers", count +1);
        System.out.println("Session created, Active users = "+ (count + 1));
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        ServletContext context = se.getSession().getServletContext();

        Integer count = (Integer) context.getAttribute("activeUsers");
        if(count == null || count ==0){
            count =0;
        }else{
            count--;
        }
        context.setAttribute("activeUsers", count);
        System.out.println("Session destroyed. Active users = "+ count);
    }
}
