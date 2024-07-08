package server;

import common.CommonMethodImpl;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            CommonMethodImpl impl = new CommonMethodImpl();
            LocateRegistry.createRegistry(1900);
            Naming.rebind("rmi://localhost:1900/rmi", impl);
            System.out.println("Server is ready");
        } catch (Exception e) {
            System.out.println("Server Exception: " + e.getLocalizedMessage());
        }
    }
}
