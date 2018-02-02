import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.net.InetAddress;

public class MyServer04 {

    private static ServerSocket server;
    private static int port = 5000;

    public static void main(String args[]){
      try{
        server = new ServerSocket(5000);
        while(true){
          Socket socket = server.accept();

          ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

          oos.writeObject("HELLO");


          socket.close();
        }
        //server.close();
      }catch(IOException e){
        System.out.println("error");
      }

    }

}
