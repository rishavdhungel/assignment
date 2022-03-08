import java.rmi.Naming; 
import java.rmi.RemoteException; 
import java.net.MalformedURLException; 
import java.rmi.NotBoundException; 

public class CalculatorClient { 
    public static void main(String[] args) { 
        try { 
            Calculator c = (Calculator)Naming.lookup("rmi://localhost:1099/rmi");  
            System.out.println( c.sub(4, 3) ); 
            System.out.println( c.add(4, 5) ); 
            System.out.println( c.mul(3, 6) ); 
            System.out.println( c.div(9, 3) ); 
        } 
        catch (Exception e) { 
            e.getMessage();
    } 
}
}