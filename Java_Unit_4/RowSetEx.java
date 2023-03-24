import javax.sql.rowset.*;
import java.sql.*;

public class RowSetEx{
    public static void main(String[] args){
       try{
        String url = "jdbc:mysql://localhost:3306/testDb";
        String userName = "root";
        String password = "";
        Class.forName("com.mysql.jdbc.Driver");

        //first create a factory object for rowset
        RowSetFactory rowSetFactory = RowSetProvider.newFactory();

        //create a JDBC rowset from the factory
        JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet();

        //Set connection properties
        rowSet.setUrl(url);
        rowSet.setUsername(userName);
        rowSet.setPassword(password);

        //Set SQL Query to execute
        rowSet.setCommand("SELECT * FROM contact");
        rowSet.execute();

        //Iterating
        while(rowSet.next()){
            System.out.println(rowSet.getInt("id") + "" +
                               rowSet.getString("name") + "" +
                               rowSet.getString("department"));
        }
        //Cached Rowset

        RowSetFactory factory = RowSetProvider.newFactory();
        CachedRowSet rowset = factory.createCachedRowSet();

        rowset.setUrl(url);
        rowset.setUsername(userName);
        rowset.setPassword(password);

        rowset.setCommand("SELECT * FROM Student");
        rowset.execute();

        while(rowset.next()){
            String name = rowset.getString("name");
            String email = rowset.getString("email");
        }
       }
       catch(SQLException e){
        System.out.println(e);
       } 
    }
}