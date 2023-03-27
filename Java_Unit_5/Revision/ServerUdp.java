

import java.net.*;
import java.io.*;

public class ServerUdp {
    public static void main(String[] args) throws IOException {
        // Create DatagramSocket
        DatagramSocket socket = new DatagramSocket(6969);
        System.out.println("Server Listening ");

        // Receive Request from Client
        byte[] bytes = new byte[256];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        socket.receive(packet); // Client Packet Receive

        // Prepare Message to Client
        InetAddress address = packet.getAddress();// Adress
        int port = packet.getPort();// Port

        String s = "Hello Client From Server";
        bytes = s.getBytes();

        // Send Message to client
        packet = new DatagramPacket(bytes, bytes.length, address, port);
        socket.send(packet);

        socket.close();

    }
}