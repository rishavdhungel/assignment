import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try{
            String rmiServer = "rmi://localhost/areacalculator";
            IAreaCalculator remoteAreaCalculator = (IAreaCalculator) Naming.lookup(rmiServer);
            float area = remoteAreaCalculator.getAreaOfRectangle(2,3);
            System.out.println("Area From Remote Object is " + area);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
