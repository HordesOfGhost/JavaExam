import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class DemoServlet extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
        //setting Content Type
        res.setContentType("text/html");

        //get the stream to write data
        PrintWriter pw = res.getWriter();

        //writing html in the stream
        pw.println(" <html> <body> ");
        pw.println(" Welcome to Servlet ");
        pw.println(" </body> </html> ");

        pw.close();

    }
}