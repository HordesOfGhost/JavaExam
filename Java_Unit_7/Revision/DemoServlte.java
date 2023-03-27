import javax.servlet.http.*;
import javax.servet.*;
import java.io.*;

public class DemoServlte extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res){
        res.setContentType("text/html");

        PrintWriter pw = res.getWriter();

        pw.println("<html><body>");
        pw.println("Welcome to servlet");
        pw.println("</body></html>");

        pw.close();
    }
}
"Insert into users(username,password) Values('"+username+"','"+password+"')";