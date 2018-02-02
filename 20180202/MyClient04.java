import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClient04 {

    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException{

        InetAddress host = InetAddress.getLocalHost();
        Socket socket = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        InetAddress IP = InetAddress.getLocalHost();
        socket = new Socket("172.16.21.56", 4999);

        oos = new ObjectOutputStream(socket.getOutputStream());
<<<<<<< HEAD
        oos.writeObject("学籍番号: 170227 \ngithub user name: nh \nHello from nh");
=======
        oos.writeObject("学籍番号: 170169 \ngithub user name: algha \nHello from algha");
>>>>>>> exam

        while(true){


        }

    }
}
