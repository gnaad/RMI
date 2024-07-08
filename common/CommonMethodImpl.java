package common;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CommonMethodImpl extends UnicastRemoteObject implements CommonMethod {

    public CommonMethodImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello from RMI";
    }
}