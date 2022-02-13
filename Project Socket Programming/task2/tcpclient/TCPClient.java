package tcpclient;
import java.net.*;
import java.io.*;

public class TCPClient {
    private static int BUFFERSIZE = 1024;
    private boolean shutdown = false;
    private Integer timeout = null;
    private Integer limit = null;
    
    public TCPClient(boolean shutdown, Integer timeout, Integer limit) {
        this.shutdown = shutdown;
        this.timeout = timeout;
        this.limit = limit;
    }

    public byte[] askServer(String hostname, int port, byte[] bytesToServer) throws IOException {       
        Socket socket = new Socket(hostname, port);
        socket.getOutputStream().write(bytesToServer);

        byte[] buffer = new byte[BUFFERSIZE];
        
        InputStream inputStream = socket.getInputStream();
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        int readBytes;

        if (this.timeout != null) socket.setSoTimeout(this.timeout);

        if (this.limit != null) {
            int totalBytes = 0;
            while ((readBytes = inputStream.read(buffer)) != -1) {
                result.write(buffer, 0, readBytes);
                totalBytes += readBytes;

                if (totalBytes >= this.limit) break;
            }
        }

        else {
            while ((readBytes = inputStream.read(buffer)) != -1) result.write(buffer, 0, readBytes);
        }

        if (this.shutdown) socket.close();

        return result.toByteArray();
    }
}
