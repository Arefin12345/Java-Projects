import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetInetAdddress {
    public static void main(String[] args) throws UnknownHostException {
//        socket methods
        Socket s = new Socket();
        System.out.println("Get inet address:");
        System.out.println(s.getInetAddress());//It will return null as the socket is not connected
        System.out.println(s.getPort()); //It will return 0 as the socket is not connected

        System.out.println(s.getLocalAddress());  /* Returns the local port to which the invoking
                                                Socket object is bound. It returns –1 if the socket is not bound */





        //Getting the ip address
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress);





        InetAddress sw[] = InetAddress.getAllByName("www.codewithharry.com");
        for (int i = 0; i <sw.length ; i++) {
            System.out.println(sw[i]);
        }
        System.out.println(inetAddress);


        System.out.println(inetAddress.getHostName());


    }
}
