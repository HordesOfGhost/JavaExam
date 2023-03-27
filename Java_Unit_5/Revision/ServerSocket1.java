import java.net.*;
import java.io.*;
import java.util.*;

public class ServerSocket1{
    public static void main(String[] args){
        ServerSocket ss = new ServerSocket(1254);
        
        Socket cs = ss.accept();

        Scanner in = new Scanner(cs.getInputStream());
        PrintWriter out = new PrintWriter(cs.getOutputStream());

        out.println("Hello Client");

        String s = in.nextLine();
        System.out.println("Message from client");


    }
}