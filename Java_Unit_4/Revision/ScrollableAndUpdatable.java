import java.sql.*;

public class ScrollableAndUpdatable {
    static Connection con;
    public static void main(String[] args){
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql//localhost/testdb");

        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

        ResultSet rs = st.executeQuery("Select * from table");

        rs.absolute(1);
        rs.moveToInsertRow();
        rs.updateString(1,"name");
        rs.updateInt(2,1);
        rs.insertRow();

        rs.next();
        rs.relative(-1);
        rs.updateString(1,"name");
        rs.updateRow();

        rs.deleteRow();

    }
    
}
