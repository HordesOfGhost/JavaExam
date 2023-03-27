import java.sql.*;
import java.sql.rowset.*;

public class RowSetEg{
    static String URL = "jdbc:mysql//localhost/db";
    static String username = "user";
    static String pw = "";
    public static void main(String[] args){
        Class.forName("com.mysql.jdbc.Driver");

        RowSetFactory rwf = RowSetProvider.newFactory();

        JdbcRowSet rs = rwf.createJdbcRowSet();

        rs.setUrl(Url);
        rs.setUserane(username);
        rs.setPassword(pw);

        rs.Commmand("SElect * From table");
        rs.execute();

        while (rs.next()){
            rs.getStrin("id");
        }

    }
}