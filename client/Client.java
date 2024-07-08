package client;

import common.CommonMethod;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        CommonMethod method = (CommonMethod) Naming.lookup("rmi://localhost:1900/rmi");
        String message = method.sayHello();
        System.out.println("Message from server: "+message);
    }
}