import java.io.*;
import java.net.*;
public class MyClient {

    public static void main(String[] args) {
        try{
        Socket s = new Socket("127.0.0.1",8888);
        DataOutputStream dataoutput = new DataOutputStream(s.getOutputStream());
        dataoutput.writeUTF("This is message from Client");
        dataoutput.flush();
        dataoutput.close();
        s.close();
         }catch(Exception e){
            e.getMessage();
        }
    }

}