import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

// Demonstrate Sockets. import java.net.*; import java.io.*;
class Whois {
    public static void main(String args[]) throws Exception {
        int c;

        try (Socket s = new Socket("whois.internic.net",43)){
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();

            String str = (args.length == 0 ? "facebook.com" : args[0])+"\n";

            //Convert to bytes
            byte buf[] = str.getBytes();
            //send request
            out.write(buf);

            //Read and display response
            while( (c = in.read() ) != -1){
                System.out.print((char)c);
            }


        }//Socket is closed here


}
}