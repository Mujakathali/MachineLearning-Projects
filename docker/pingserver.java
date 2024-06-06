import java.util.*;
class Muja
{
    public static void main(Strings args[])throws Exception
    {
      
        long t1,t2;
        int c=0;
        String str;
        
        Socket s=new Socket("localhost",5555);
        DataInputStream dis=new DataInputStream(s.getInputStream());
        PrintStream out=new PrintStream(s.getOutputStream());
        
        while(c<4)
        {
            t1=System.currentTimeMillis();
            str="Hello";
            out.println(str);
            System.out.println(dis.readLine());
            t2=System.currentTimeMillis();
            System.out.println(";TTL="+(t2-t1)+"ms")
            c++;
        }
        s.close();
    }
}