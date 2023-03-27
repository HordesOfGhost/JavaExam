import java.sql.*;

public class CompleteJDBC{
    static Connection con;
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql//localhost/db","user","");

            Statement st = con.createStatement();

            //Create Table
            String createTable = "CREATE TABLE student (id INT PRIMARY KEY, name VARCHAR(20),DOB DATE)";
            st.executeUpdate(createTable);

            //Insert Data
            String insertData = "INSERT INTO student VALUES(1,'Bibek','2020-02-11')";
            st.executeUpdate(insertData);

            //Retrieve
            String retrieveData = "SELECT * FROM student";
            ResultSet rs = st.executeQuery(retrieveData);

            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Date d = rs.getDate("DOB");
            }

            // Delete
            String deleteData = "DELTE FROM student Where id = 1";
            st.executeUpdate(deleteData);

            //Update
            String updateData = "UPDATE student set name = 'Sakila' WHERE id = 1 ";
            st.executeUpdate(updateData);

            //Drop
            String drop = "DROP TABLE student";
            st.executeUpdate(drop);
        }catch(SQLException sq){
            System.out.println(sq.getMessage());
        }
    }
}