import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIMethodImpl extends UnicastRemoteObject implements RMIMethod {

    RMIMethodImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello from RMI";
    }
}
