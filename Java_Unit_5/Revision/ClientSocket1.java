import java.net.*;
import java.io.*;
import java.util.*;

public class ClientSocket1{
    public static void main(String[] arg) throws IOException{
        Socket cs = new Socket("localhost",1254);

        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(),true);

        outs.println("Hello Server");
        String s = ins.nextLine();
        System.out.println("From Server" + s );

        ins.close();
        outs.close();
        cs.close();

    }
}