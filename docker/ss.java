import java.io.*;
import java.net.*;

class SocketServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5555);
             Socket clientSocket = serverSocket.accept();
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            System.out.println("Received message from client: " + in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
