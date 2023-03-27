import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;

public class FormHandle extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServeletResponse res) throws ServletException,IOException{
        res.setContentType("text/html");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        //To give response or to print in HTML page
        PrintWriter pw = res.getWriter();

        pw.println("UserName"+username);
        pw.println("password"+password);

        //to save in database
        try{
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql//localhost/dba","username","pw");

            String query = "INSERT INTO user(username,password) VALUES(?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setString(1,username);
            ps.setString(2,password);
            
            ps.executeUpdate();
            
            con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}