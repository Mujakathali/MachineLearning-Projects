import java.util.*;
import java.io.*;

class Muja {
    public static void main(String[] args) {
        Scanner oc = new Scanner(System.in);

        System.out.print("Enter the domain or IP to trace: ");
        String s = oc.nextLine();
        
        try {
            Runtime H = Runtime.getRuntime();
            Process P = H.exec("tracert " + s);
            
            BufferedReader dis = new BufferedReader(new InputStreamReader(P.getInputStream()));
            String str;
            while ((str = dis.readLine()) != null) {
                System.out.println(str);
            }
            
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
