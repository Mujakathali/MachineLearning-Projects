import java.util.*;
import java.io.*;
import java.net.*;

class sender{
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);
        Socket soc = new Socket("localhost",12345);
        System.out.print("Enter the IP address: ");
        String ip = s.nextLine();
        PrintStream out = new PrintStream(soc.getOutputStream());
        DataInputStream dis = new DataInputStream(soc.getInputStream());
        
        
        int i = 0;
        while(i<4){
            long t1 = System.currentTimeMillis();
            out.println(ip);
            System.out.println(dis.readLine());
            long t2 = System.currentTimeMillis();
            System.out.println("TTl : "+(t2-t1)+"bytes : 32   Time : "+(t1+t2-3400000000));
            i++;
        }
    }
}
