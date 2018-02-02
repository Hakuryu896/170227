import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.net.InetAddress;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyServer06 {

    private static ServerSocket server;
    private static int port = 5000;

    public static void main(String args[]){

      DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
  Date date = new Date();


      try{
        server = new ServerSocket(3999);
        while(true){
          Socket socket = server.accept();

          InetAddress addr = socket.getInetAddress();


          String message  = "";
          try{
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            message = (String) ois.readObject();

          }catch(ClassNotFoundException ex){

          }

          ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
          oos.writeObject(message);

          socket.close();
        }
        //server.close();
      }catch(IOException e){
        System.out.println("error");
      }

    }

}
