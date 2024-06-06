import java.io.*;
import java.net.*;

class StopAndWaitServer {
    public static void main(String args[]) {
        try (
                ServerSocket ss = new ServerSocket(5555);
                Socket s = ss.accept();
                BufferedReader buf1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
                PrintStream out = new PrintStream(s.getOutputStream())) {
            String message;
            while (!(message = buf1.readLine()).equals("exit")) {
                System.out.println("Frame " + message + " was received");
                Thread.sleep(500); // Consider removing or adjusting this sleep
                out.println("received");
            }
            System.out.println("All Frames were received successfully");
        } catch (IOException | InterruptedException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
