import java.sql.*;

public class JFBCEg{
    static Connection con;
    public static void main(String[] args){
        try{    
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:sql//localhost/db","root","");

            Statement st = con.createStatement();

            String query = "SELECT * From Student Where address = 'Kathmandu'";

            ResultSet rs = st.executeQuery(query);

            while(rs.next()){
                int Id = rs.getInt("ID");
                String name = rs.getString("name");
                Date d = rs.getDate("date");
            }
            
        }catch(Exception e){
        }
        finally{
            con.close();
        }
    }
}