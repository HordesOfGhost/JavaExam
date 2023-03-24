import java.sql.*;

public class ScrollableResultSet{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");

            //Connection
            Connection con = DriverManager.getConnection("jdbc:mysql//localhost:3306/test","root","user");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("Select * from emp");

            rs.first();
            System.out.println("FirstRecord");
            System.out.println(rs.getInt(1) + " "+rs.getString(2));
            
            
            rs.absolute(3);
            System.out.println("ThirdRecord");
            System.out.println(rs.getInt(1) + " "+rs.getString(2));

            
            rs.next();
            System.out.println("FourthRecord");
            System.out.println(rs.getInt(1) + " "+rs.getString(2));
            
            
            rs.last();
            System.out.println("LastRecord");
            System.out.println(rs.getInt(1) + " "+rs.getString(2));
            
            rs.relative(-1);
            System.out.println("FirstRecord");
            System.out.println(rs.getInt(1) + " "+rs.getString(2));
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}