import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIMethod extends Remote {
    String sayHello() throws RemoteException;
}
