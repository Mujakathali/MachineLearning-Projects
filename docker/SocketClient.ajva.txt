import java.io.*;
import java.net.*;

class SocketClient {
    public static void main(String[] args) {
        try (
            Socket s = new Socket("localhost", 5555);
            PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
            BufferedReader buf1 = new BufferedReader(new InputStreamReader(System.in))
        ) {
            System.out.println("Enter a message to send to the server: ");
            String str = buf1.readLine();
            pw.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
