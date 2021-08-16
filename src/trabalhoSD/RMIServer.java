package trabalhoSD;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) throws RemoteException {

        Interface_remota loja = new umaLoja();
        try{
            LocateRegistry.createRegistry(1099);
            System.out.println("Registro local deu certo");
            Naming.bind("Interface_remota", loja);
            System.out.println("Servidor da loja online");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
