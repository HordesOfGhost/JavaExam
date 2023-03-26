import java.io.*;
import java.net.*;

public class Client
{
    public static void main(String[] args) throws IOException{
        try{
            Socket con = new Socket("localHost",95);

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            PrintWriter out = new PrintWriter(con.getOutputStream(),true);

            while(true){
                String s1 = in.readLine();
                //From Serrver = s1

                //to Server
                BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
                String st = din.readLine();
                
                if(st.equalsIgnoreCase("Bye") || st ==null)break;
            }
            in.close();
            out.close();
            con.close();
        }catch(UnknownHostException e){}
    }
}