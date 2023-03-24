import java.sql.*;

public class TransactionEx{
    public static void main(String[] args){
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost");
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            //set autoCommit to false
            conn.setAutoCommit(false);

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("Insert into employee values(190,'Bibek',78855)");
            stmt.executeUpdate("Insert into employee values(191,'Sakila',78855)");

            conn.commit();
            conn.close();
        }
        catch(SQLException e){
            System.out.println(e);
            conn.rollback();
        }finally{
            conn.setAutoCommit(true);
        }
    }
}