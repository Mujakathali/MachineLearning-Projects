import java.util.*;
import java.io.*;
import java.net.*;

class sample{
    public static void main(String args[]) throws Exception{
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The IP Address: ");
        String ip = s.nextLine();
        Runtime h = Runtime.getRuntime();
        Process p = h.exec("tracert "+ip);
        DataInputStream dis = new DataInputStream(p.getInputStream());
        String str;
        while((str = dis.readLine())!=null){
            System.out.println(str);
        }
    }
}