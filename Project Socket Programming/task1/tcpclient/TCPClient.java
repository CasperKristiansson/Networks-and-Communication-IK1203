package tcpclient;
import java.net.*;
import java.io.*;

public class TCPClient{
    private static int BUFFERSIZE = 1024;

    public TCPClient(){
        
    }

    public byte[] askServer(String hostname, int port, byte[] bytesToServer) throws IOException {
        Socket socket = new Socket(hostname, port);
        socket.getOutputStream().write(bytesToServer);

        byte[] buffer = new byte[BUFFERSIZE];

        InputStream i = socket.getInputStream();
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        int readBytes;
        
        while ((readBytes = i.read(buffer)) != -1) result.write(buffer, 0, readBytes);

        socket.close();
        return result.toByteArray();
    }
}
