import jakarta.servlet.*;

import java.io.IOException;

public class TimingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();

        System.out.println("TimingFilter -> Pre-processing");

        filterChain.doFilter(servletRequest, servletResponse);

        long end = System.currentTimeMillis();
        System.out.println("TimingFilter -> Time taken: "+(end - start)+ " ms");
    }
}
