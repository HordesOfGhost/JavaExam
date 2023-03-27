import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class JDBCForm implements ActionListener{
    JTextField id,title,genre,language,length;
    JLabel idLabel,titleLabel,genreLabel,lengthLabel;
    JButton submitButton;

    JDBCForm(){

        JFrame f = new JFrame("SQL");

        f.setLayout(new GridLayout(5,2));

        id = new JTextField();
        idLabel = new JLabel("Id :");
        f.add(idLabel);
        f.add(id);

        title = new JTextField();
        titleLabel = new JLabel("Title :");
        f.add(titleLabel);
        f.add(title);

        genre = new JTextField();
        genreLabel = new JLabel("Genre :");
        f.add(genreLabel);
        f.add(genre);

        length = new JTextField();
        lengthLabel = new JLabel("Length :");
        f.add(lengthLabel);
        f.add(length);

        submitButton = new JButton("Submit");
        f.add(submitButton);
        
        submitButton.addActionListener(this);

        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        Connection con;
        try{
            Class.forName("com.mysql.jdbc.driver");
            
            con = DriverManager.getConnection("jdbc:mysql//localhost/testdb","root","");

            String query = "INSERT INTO Movie(id,Title,Genre,Length) VALUES (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);

            int id_ = Integer.parseInt(id.getText());
            String title_ = title.getText();
            String genre_ = genre.getText();
            int length_ = Integer.parseInt(length.getText());

            pst.setInt(1,id_);
            pst.setString(2,title_);
            pst.setString(3,genre_);
            pst.setInt(4,length_);

            pst.executeUpdate();
            con.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args){
        new JDBCForm();
    }
}