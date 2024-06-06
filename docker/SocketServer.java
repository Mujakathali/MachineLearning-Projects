import java.io.*;
import java.net.*;

class SocketServer {
    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(5555)) {
            while (true) { // Loop to accept multiple connections
                try (Socket s = ss.accept();
                     BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()))) {
                    System.out.println("The Message Received is: " + in.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
