
import java.util.*;
import java.net.*;
import java.io.*;
import java.awt.*;

class receiver{
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(12345);
        Socket soc = ss.accept();
        DataInputStream dis = new DataInputStream(soc.getInputStream());
        File f = new File(dis.readLine());
        Desktop d = Desktop.getDesktop();
        System.out.println("Server waiting for image...");
        System.out.println("Received image Successfully.");
        d.open(f);
        
    }
}
