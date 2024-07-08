package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CommonMethod extends Remote {
    String sayHello() throws RemoteException;
}