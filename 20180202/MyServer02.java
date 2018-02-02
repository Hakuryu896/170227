import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.net.InetAddress;

public class MyServer02 {

    private static ServerSocket server;
    private static int port = 5999;

    public static void main(String args[]){
      try{
        server = new ServerSocket(6000);
        while(true){
          Socket socket = server.accept();

           InetAddress addr = socket.getInetAddress();

        


          ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

<<<<<<< HEAD
          oos.writeObject("Client!!, your id address is: "+addr.getHostAddress());
=======
          oos.writeObject("Hi Client, your id address is: "+addr.getHostAddress());
>>>>>>> exam


          oos.close();
          socket.close();
        }
        //server.close();
      }catch(IOException e){
        System.out.println("error");
      }

    }

}
