import java.util.*;
import java.net.*;
import java.io.*;


class receiver{
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(12345);
        Socket soc = ss.accept();
        DataInputStream dis = new DataInputStream(soc.getInputStream());
        PrintStream out = new PrintStream(soc.getOutputStream());
        int i=0;
        while(i<4){
            String msg = dis.readLine();
            out.println("Replying to "+msg+" : ");
            i++;
        }
        
    }
}