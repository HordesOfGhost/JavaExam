//For import

<%page import="java.sql.*" %>


<%

// get values
int id = Integer.parseInt(req.getParameter("id"));
String username = req.getParameter("username");

//to print we use out.println in website
out.println(id);
out.print(username);

// now for saving in database
try{
    Class.forName("com.mysql.jdbc.Driver");

    Connection con = DriverManager.getConnection("jdbc:mysql//localhost/testdb","user","password");

    String query = "INSERT INTO user(id,name) VALUES(?,?)";

    PreparedStatement ps = con.prepareStatement(query);

    ps.setInt(1,id);
    ps.setString(2,username);

    ps.executeUpdate();

    con.close();
}catch(SQLException e){
    System.out.println(e.getMessage());
}
%>
