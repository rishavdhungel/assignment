import java.io.*;
import java.net.*;
public class UDPServer {
    public static void main(String[] args) {
        try{
        byte[] receiveData = new byte[1024];
        byte[] sendData = new byte[1024];

        // datagram socket
        DatagramSocket serverSocket = new DatagramSocket(8081);
        while(true){
            // check for connection
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length) ;
            serverSocket.receive(receivePacket);
            
            // get address and port
            InetAddress clientAddress = receivePacket.getAddress();
            int clientPort = receivePacket.getPort(); 
        
            
            // send data
            String toSendData = "Hello from Server";
            sendData = toSendData.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
            serverSocket.send(sendPacket);
        }
        }catch(Exception e){
            e.getMessage();
        }
    }
}
