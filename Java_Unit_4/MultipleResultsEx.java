import java.sql.*;

public class MultipleResultsEx{
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/emp?allowMultipleQueries=true";
        String userName = "root";
        String password = "";

        try{
            // Connection
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,userName,password);

            // Create Statement
            Statement stmt = con.createStatement();

            
            int rsCount = 0;
            String SQL = "SELECT * FROM employees Where salary<5000;
                          SELECT FROM employees WHERE salary>5000";
            
            //Returns true for multiple value
            boolean results = stmt.execute(SQL);
            
            do{
                if(results){
                    ResultSet rs = stmt.getResultSet();
                    rsCount++;

                    while (rs.next()){
                        int id = rs.getString("Id");
                    }
                }
                results = stmt.getMoreResults();
            }while(results);
            
            conn.close();
        }catch(SQLException sqle){
            System.out.println(e);
        }
    }
}