import java.io.*;
import java.net.*;
public class UDPClient {
    public static void main(String[] args) {
        try{
            byte[] receiveData = new byte[1024];
            byte[] sendData = new byte[1024];
            
            // server details
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 8081;
            // socket
            DatagramSocket clientSocket = new DatagramSocket();
            //  send data
            sendData = "MSG from client".getBytes(); 
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,serverAddress, serverPort);
            clientSocket.send(sendPacket);
    
        

        }catch(Exception e){
            e.getMessage();
        }
    }
}
