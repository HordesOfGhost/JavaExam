import java.sql.*;

public class UpdatableResultSet{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");

            //Connection
            Connection con = DriverManager.getConnection("jdbc:mysql//localhost:3306/test","root","user");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("Select * from emp");

            //Inserting
            rs.absolute(3);
            rs.moveToInsertRow();
            rs.updateInt(1,7);
            rs.updateString(2,"Bibek");
            rs.insertRow();
            
            //Updating
            rs.absolute(7);
            rs.updateString(2,"Sakila");
            rs.updateRow();
            
            //Deleting 
            rs.absolute(10);
            rs.deleteRow();
            
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}