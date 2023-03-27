import java.rmi.*;
import java.rmi.server.*;

public class AdderClass extends UnicastRemoteObject implements AdderInterface{
    AdderClass() throws RemoteException {
        super();
    }
    public int add(int x,int y){
        return x+y;
    }
}