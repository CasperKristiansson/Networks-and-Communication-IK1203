import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class MyRunnable implements Runnable {
    private final int BUFFER_SIZE = 1024;
    private Socket socket;
    private StringBuilder result = new StringBuilder();

    private String hostname = "";
    private Integer portClient = null;
    private byte[] bytesToServer = new byte[0];
    private Integer timeout = null;
    private Integer limit = null;
    private boolean shutdown = false;
    
    public MyRunnable(Socket socket) {
        this.socket = socket;        
    }

    @Override
    public void run() {
        try {
            String input = getInput();

            if(checkRequest(input)) {
                this.result.append("HTTP/1.1 400 Bad Request\r\n");
                throw new Exception("Bad Request");
            }
            
            getParameters(input);
            processRequest();
            closeSocket();

        } catch (Exception e) {
            e.printStackTrace();
            closeSocket();
        }
    }

    private String getInput() throws IOException {
        byte[] buffer = new byte[this.BUFFER_SIZE];
        this.socket.getInputStream().read(buffer);
        String decodedString = new String(buffer, StandardCharsets.UTF_8);

        return decodedString;
    }

    private boolean checkRequest(String input) {
        String[] request = input.split(" ");
        return (!request[0].equals("GET") || !input.contains("HTTP/1.1"));
    }

    private void getParameters(String input) throws Exception {
        String request = input.split(" ")[1];
        String[] params = request.split("\\?");

        if (params.length > 0 && params[0].equals("/ask")) {
            if (params.length < 2) {
                this.result.append("HTTP/1.1 400 Bad Request\r\n");
                throw new Exception("Bad Request");
            }

            String[] paramList = params[1].split("&");

            for (String param : paramList) {
                String[] keyValue = param.split("=");

                if (keyValue.length < 2) {
                    this.result.append("HTTP/1.1 400 Bad Request\r\n");
                    throw new Exception("Bad Request");
                }

                if (keyValue[0].equals("shutdown")) {
                    this.shutdown = Boolean.parseBoolean(keyValue[1]);
                } else if (keyValue[0].equals("timeout")) {
                    this.timeout = Integer.parseInt(keyValue[1]);
                } else if (keyValue[0].equals("limit")) {
                    this.limit = Integer.parseInt(keyValue[1]);
                } else if (keyValue[0].equals("hostname")) {
                    this.hostname = keyValue[1];
                } else if (keyValue[0].equals("port")) {
                    this.portClient = Integer.parseInt(keyValue[1]);
                } else if (keyValue[0].equals("bytes")) {
                    this.bytesToServer = keyValue[1].getBytes();
                }
            }
        } else {
            this.result.append("HTTP/1.1 404 Not Found\r\n");
            throw new Exception("Not Found");
        }

        if (this.hostname.equals("") || this.portClient == null) {
            this.result.append("HTTP/1.1 400 Bad Request\r\n");
            throw new Exception("Bad Request");
        }
    }

    private void processRequest() throws Exception {
        try {
            TCPClient client = new TCPClient(this.shutdown, this.timeout, this.limit);

            String request = new String(client.askServer(this.hostname, this.portClient, this.bytesToServer));

            this.result.append("HTTP/1.1 200 OK\r\n\r\n");
            this.result.append(request);

        } catch (Exception e) {
            this.result.append("HTTP/1.1 500 Internal Server Error\r\n");
            throw new Exception("Internal Server Error");
        }
    }

    private void closeSocket() {
        try {
            this.socket.getOutputStream().write(this.result.toString().getBytes());
            this.socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
