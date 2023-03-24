import java.sql.*;

public class CompleteJDBC{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");

            //Get Connection
            String url = "jdbc:mysql://localhost:3306/database";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url,username,password);

            //Creating Statement
            Statement st = conn.createStatement();

            //Create a new table using DDL
            String createTable = "Create Table users(id INT PRIMARY KEY,name VARCHAR(255),email VARCHAR(255))";
            st.executeUpdate(createTable);

            //Insert daat into the table
            String insertData = "Insert into users values(1,'Bibek','Bibek1129@gmail.com')";
            st.executeUpdate(insertData);

            //Retreiving data
            String retrieveData = "Select * From users";
            ResultSet rs = st.executeQuery(retrieveData);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
            }

            //Update data
            String updateData = "Update users Set name = 'Sakila' where id = '1' ";
            st.executeUpdate(updateData);

            //Delete Data
            String deleteData = "DELETE From users where id = '1'";
            st.executeUpdate(deleteData);

            //Drop
            String dropTable = "Drop table users";
            st.executeUpdate(dropTable);

            //Prepared Statement
            String query = "INSERT INTO users(id,name,email) VALUES(?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            
            pstmt.setInt(1,1);
            pstmt.setString(2,"Bibek");
            pstmt.setString(3,"Bibek@gmail.com");

            pstmt.setInt(1,2);
            pstmt.setString(2,"Sakila");
            pstmt.setString(3,"Sakila@gmail.com");
            
            st.close();
            conn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}