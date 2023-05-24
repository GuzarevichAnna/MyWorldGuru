import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class HelloOutput implements Servlet {
    private static final long serialVersionUID = 1L;
    public HelloOutput() {
    }
    ServletConfig configurates=null;
    @Override
    public void init(ServletConfig configurates) throws ServletException {
        this.configurates = configurates;
        System.out.println("Servlet Object initializes here.");
    }
    @Override
    public void destroy() {
        System.out.println("Close connection and End process here.");
    }
    @Override
    public ServletConfig getServletConfig() {
        return configurates;
    }
    @Override
    public String getServletInfo() {
        return "Educba Website";
    }
    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printout = response.getWriter();
        printout.println("<h2>Hello World First Example using " +
                "Servlet Methods.</h2>");
        printout.close();
    }
}
