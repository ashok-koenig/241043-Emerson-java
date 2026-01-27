import jakarta.servlet.*;

import java.io.IOException;

public class LoggingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("LoggingFilter initialized");
    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        System.out.println("LoggingFilter -> Before Servlet");

        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("LoggingFilter -> After Servlet");
    }

    @Override
    public void destroy() {
        System.out.println("LoggingFilter destroyed");
    }
}
