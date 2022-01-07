import java.rmi.*;
public class Server {
    public static void main(String[] args) {
        try{
        IAreaCalculator stub = new AreaCalculator();
        Naming.rebind("rmi://localhost:5000/areacalculator", stub);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
