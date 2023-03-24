import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SimpleJDBC{
    public static void main(String[] args){
        try{
            //Load JDBC Driver
            Class.forName("com.mysql.jdbc.Driver");

            //Establish a connection
            String url = "jdbc:mysql//localhost:3306/test";
            Connection conn = DriverManager.getConnection(url);

            //Create a statment
            Statement st = conn.createStatement();

            //Execute a statement
            ResultSet rs = st.executeQuery("SELECT * FROM Employees");

            while(rs.next()){
                int id = rs.getInt("E_ID");
                String name = rs.getString("E_Name");
                String address = rs.getString("E_Address");
                // Date date = rs.getDate("DOB");
            }

            rs.close();
            st.close();
            conn.close();
        }
        catch(SQLException sqlExc){
            System.out.println("sqlExc.getMessage()");
        }
    }
}