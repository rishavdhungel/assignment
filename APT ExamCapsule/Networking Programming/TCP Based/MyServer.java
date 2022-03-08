import java.io.*;
import java.net.*;
public class MyServer {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(8888);
            Socket s = ss.accept();
            DataInputStream datainput = new DataInputStream(s.getInputStream());
            String message = (String)datainput.readUTF();
            System.out.println("message ="+message);
            ss.close();
            
        }catch(Exception e){
            e.getMessage();
        }
    }
}
