import java.io.*;
import java.net.*;

public class Server{
    public static void main(String a[]) throws IOException{
        try{
            //Server socket
            ServerSocket s = new ServerSocket(95);

            //Accept
            Socket cs = s.accept();

            InetAddress ia = cs.getInetAddress();
            String cli = ia.getHostAddress();

            System.out.println("IP : "+cli);

            //Input Stream
            BufferedReader in = new BufferedReader(new InputStreamReader(cs.getInputStream()));

            PrintWriter out = new PrintWriter(cs.getOutputStream(),true);

            do{
                BuffferedReader din = new BufferedReader(new InputStreamReader(System.in));
                // To Client
                String tocl = din.readLine();

                String st = in.readLine();
                if(st.equalsIgnoreCase("Bye") || st == null)break;
                //print from client st
            }
            in.close();
            out.close();
            cs.close();
        }catch(IOException e){}
    }
}