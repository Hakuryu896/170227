import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClient01 {

    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException{

        InetAddress host = InetAddress.getLocalHost();
        Socket socket = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        InetAddress IP = InetAddress.getLocalHost();
        socket = new Socket(IP, 6000);

        // ois = new ObjectInputStream(socket.getInputStream());
        // String message = (String) ois.readObject();
        // System.out.println("Message: " + message);
        while(true){




        }

    }
}
