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
        System.out.println("Shutdown: " + shutdown + " Timeout: " + timeout + " Limit: " + limit);     
        Socket socket = new Socket(hostname, port);

        socket.getOutputStream().write(bytesToServer);
        if (shutdown) socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[BUFFERSIZE];
        int readBytes;

        try {
            // Sets a maximum time to wait for data
            if (this.timeout != null) socket.setSoTimeout(this.timeout);

            if (this.limit != null) {
                int totalBytes = 0;
                
                // If the limit is less than the buffer size, use the limit as the buffer size
                if (this.limit < BUFFERSIZE) buffer = new byte[this.limit];

                while ((readBytes = inputStream.read(buffer)) != -1 && totalBytes < this.limit) {
                    result.write(buffer, 0, readBytes);
                    totalBytes += readBytes;

                    if (totalBytes >= this.limit) break;
                    // To get the exact amount of bytes we need to adjust the buffer size for the last read
                    if (totalBytes + BUFFERSIZE > this.limit) buffer = new byte[this.limit - totalBytes];
                }
            } else {
                while ((readBytes = inputStream.read(buffer)) != -1) result.write(buffer, 0, readBytes);
            }
        } catch (SocketTimeoutException e) {
            System.out.println("Socket timed out!");
        }

        if (this.shutdown) socket.close();

        return result.toByteArray();
    }
}
