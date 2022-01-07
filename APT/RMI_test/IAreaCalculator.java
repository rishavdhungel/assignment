import java.rmi.*;
public interface IAreaCalculator extends Remote{
    public float getAreaOfRectangle(float l, float b) throws RemoteException;

}