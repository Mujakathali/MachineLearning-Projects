import java.io.*;
import java.net.*;

public class Sender {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 12345);
             OutputStream os = socket.getOutputStream();
             PrintWriter pw = new PrintWriter(os, true);
             FileInputStream fis = new FileInputStream(new File("D:\\docker\\image.jpg"))) { // Corrected file path
            pw.println("image.jpg");
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            System.out.println("Image sent successfully.");
        }
    }
}
