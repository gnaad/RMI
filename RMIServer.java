import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            RMIMethodImpl impl = new RMIMethodImpl();
            LocateRegistry.createRegistry(8080);
            Naming.rebind("rmi://localhost:8080/RMIMethod", impl);
            System.out.println("Server is ready");
        } catch (Exception e) {
            System.out.println("Server Exception: " + e.getLocalizedMessage());
        }
    }
}
