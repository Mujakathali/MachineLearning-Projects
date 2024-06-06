import java.util.*;
import java.io.*;
import java.net.*;

class StopAndWaitClient {
    public static void main(String args[]) {
        try (
                Scanner oc = new Scanner(System.in);
                Socket s = new Socket("127.0.0.1", 5555);
                BufferedReader buf1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
                PrintStream out = new PrintStream(s.getOutputStream())) {
            System.out.println("Enter number of frames to send: ");
            int n = oc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Frame no " + i + " is sent");
                out.println(i);
                if (buf1.readLine() != null) {
                    System.out.println("Acknowledgement was received");
                    // Thread.sleep(4000); // Consider removing or adjusting this sleep
                } else {
                    out.println(i);
                }
            }
            out.println("exit");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
