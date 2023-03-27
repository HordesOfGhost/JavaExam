import java.net.*;
import java.io.*;

public class ClientUDP1{
    public static void main(String[] args) throws IOException{
        DatagramSocket socket = new DatagramSocket();

        byte[] buf = new byte[256];

        String msg = "Hello UDP Server";
        buf = msg.getBytes();
        
        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket packet = new DatagramPacket(buf,buf.length,address,1234);

        socket.send(packet);

    }
}