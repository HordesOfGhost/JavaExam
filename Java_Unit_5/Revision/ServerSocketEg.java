import java.util.*;
import java.io.*;
import java.net.*;

public class SoServer {

    static int fact(int a) {
        if (a == 0)
            return 1;
        return a * fact(a - 1);
    }

    public static void main(String[] args) throws IOException {
        // 1. Create a Server socket at certain port
        ServerSocket s = new ServerSocket(6969);

        // 2. Accept Client Socket Connection
        Socket clientSocket = s.accept();

        // 3. Create Variables For R/W
        Scanner ins = new Scanner(clientSocket.getInputStream());
        PrintWriter outs = new PrintWriter(clientSocket.getOutputStream(), true);

        // 4. Receive Client Message
        int num = ins.nextInt();

        // 5. Calculate Factorial and send result to client
        outs.println(fact(num));

        // 6. Close All Connection
        ins.close();
        outs.close();
        s.close();

    }
}
