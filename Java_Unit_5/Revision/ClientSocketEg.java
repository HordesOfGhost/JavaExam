import java.net.*;
import java.io.*;
import java.util.*;

public class ClientSocketEg{
    public static void main(String[] args) throws IOException{
        //Open Socket
        Socket cs = new Socket("Localhost",6969);

        //Create input and output stream
        Scanner in = new Scanner(cs.getInputStream());
        PrintWriter out = new PrintWriter(cs.getOutputStream(),true);

        //Read and write
        out.println(8);
        int fact = in.nextInt();

        System.out.println("Fact is "+fact);

        in.close();
        out.close();
        cs.close();
    }
}