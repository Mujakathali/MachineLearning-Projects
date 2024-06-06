import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.IOException;

class TraceServer {
    public static void main(String[] args) {
        try {
            // Prompt the user to enter the IP address to be traced
            System.out.print("Enter the IP Address to be Traced: ");
            BufferedReader buf1 = new BufferedReader(new InputStreamReader(System.in));
            String ip = buf1.readLine();

            // Get the runtime object
            Runtime H = Runtime.getRuntime();

            // Execute the tracert command (use "tracert" for Windows)
            Process p = H.exec("tracert " + ip);

            // Get the input stream of the process (output of tracert command)
            InputStream in = p.getInputStream();
            BufferedReader buf2 = new BufferedReader(new InputStreamReader(in));

            String str;
            // Read and print the output of the tracert command line by line
            while ((str = buf2.readLine()) != null) {
                System.out.println(" " + str);
            }
        } catch (IOException e) {
            // Print any exceptions that occur
            System.out.println(e.getMessage());
        }
    }
}
