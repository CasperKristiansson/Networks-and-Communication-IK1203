package tcpclient;
import java.net.*;
import java.io.*;

public class TCPClient{

    public TCPClient(){
        
    }

    public byte[] askServer(String hostname, int port, byte[] bytesToServer) throws IOException {
        Socket socket = new Socket(hostname, port);
        OutputStream o = socket.getOutputStream();
        o.write(bytesToServer);

        InputStream i = socket.getInputStream();

        return i.readAllBytes();
    }
}
