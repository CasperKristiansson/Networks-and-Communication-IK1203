import java.net.*;
import java.io.*;

public class HTTPAsk {
    public static void main(String[] args) {
        int port = 0;

        try {
            // TODO: Temporarily hard-coded
            // port = Integer.parseInt(args[0]);
            port = 8080;
            ServerSocket serverSocket = new ServerSocket(port);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Accepted connection from " + socket.getInetAddress());
                
                
                BufferedReader socketInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                DataOutputStream socketOutput = new DataOutputStream(socket.getOutputStream());

                StringBuilder sb = new StringBuilder();
                String url = socketInput.readLine();
                
                if (url.equals("GET /ask? HTTP/1.1")) {
                    sb.append("HTTP/1.1 200 OK\r\n\r\n");
                } else {
                    sb.append("HTTP/1.1 404 Not Found\r\n\r\n");
                }

                socketOutput.writeBytes(sb.toString());
                
                socket.close();
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Usage: java HTTPAsk <port>");
            System.exit(1);

        } catch (IOException e) {
            System.out.println("Could not listen on port " + port);
            System.exit(1);
        }
    }
}
