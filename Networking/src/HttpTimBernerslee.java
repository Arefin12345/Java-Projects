import java.net.MalformedURLException;
import java.net.URL;

import static jdk.nashorn.internal.objects.Global.getDate;

public class HttpTimBernerslee {

    public static void main(String[] args) throws MalformedURLException {

        //That is url class
        URL url = new URL("https://www.youtube.com/watch?v=qxYbHzn8bbU");

        System.out.println("Protocol : "+url.getProtocol());
        System.out.println("Port "+url.getPort());
        System.out.println("Host "+url.getHost());

        System.out.println("Date "+getDate("https://www.youtube.com/"));

        System.out.println("File "+url.getFile());
        System.out.println("To ExternalForm "+url.toExternalForm());



    }
}
