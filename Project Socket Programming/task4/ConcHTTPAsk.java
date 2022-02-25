import java.net.*;
import java.io.*;

public class ConcHTTPAsk {
    public static void main(String[] args) {
        try {
            int port = Integer.parseInt(args[0]);
            //int port = 8888;
            ServerSocket serverSocket = new ServerSocket(port);

            while (true) {
                Socket socket = serverSocket.accept();
                Runnable thread = new MyRunnable(socket);
                new Thread(thread).start();

                // System.out.println("Accepted connection from " + socket.getInetAddress());
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            // System.out.println(e);
            System.exit(1);

        } catch (IOException e) {
            // System.out.println(e);
            System.exit(1);
        }
    }
}
