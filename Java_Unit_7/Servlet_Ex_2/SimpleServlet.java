import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FormServlet extends HttpServlet{

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException , IOException{

        // Get request parameters.
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Set the response content type
        response.setContentType("text/html");

        // Get the output stream for writing the response
        PrintWriter out = response.getWriter();

        // Print the response
        out.println(" <html> <body> ");
        out.println(" <p> Username: " + username + "</p>");
        out.println(" <p> Password: " + password + "</p>");
        out.println(" </body> </html> ");

    }
}