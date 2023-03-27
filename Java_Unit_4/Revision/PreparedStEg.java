import java.sql.*;

public class PreparedStEg{
    static Connection con;

    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.driver");

            con = DriverManager.getConnection("jdbc:mysql//localhost/db","root","");
            
            // Retreive
            String rt = "SELECT * FROM student where name =?";
            PreparedStatement psr = con.prepareStatement(rt);

            psr.setString(1,"Bibek");

            ResultSet rs = psr.executeQuery();

            //Insert
            String ins = "INSERT INTO student(id,name,address) VALUES(?,?,?)";

            PreparedStatement psi = con.prepareStatement(ins);

            psi.setInt(1,1);
            psi.setString(2,"Bibek");
            psi.setString(3,"Address");

            psi.setInt(1,2);
            psi.setString(2,"Sakila");
            psi.setString(3,"Thamel");

            int rows = psi.executeUpdate();
            




        }

    }
}