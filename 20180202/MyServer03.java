import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.net.InetAddress;

public class MyServer03 {

    private static ServerSocket server;
    private static int port = 5999;

    public static void main(String args[]){
      try{
        server = new ServerSocket(5999);
        while(true){
          Socket socket = server.accept();

          try{
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            String message = (String) ois.readObject();
            System.out.println("from client: " + message);

              ois.close();
          }catch(ClassNotFoundException ex){

          }





          socket.close();
        }
        //server.close();
      }catch(IOException e){
        System.out.println("error");
      }

    }

}
