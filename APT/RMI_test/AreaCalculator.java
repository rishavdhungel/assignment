import java.rmi.*;
import java.rmi.server.*;
public class AreaCalculator extends UnicastRemoteObject implements IAreaCalculator {
    public AreaCalculator() throws RemoteException{
        super();
    }
    public float getAreaOfRectangle(float l, float b) throws RemoteException{
        float area = 1*b;
        return area;
    }
}
