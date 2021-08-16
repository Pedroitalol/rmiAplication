package trabalhoSD;

import java.rmi.*;

public interface Interface_remota extends Remote{
    public String mostrarProdutos() throws RemoteException;
    public String venderProduto(String nome) throws RemoteException;
    public String marcarHora(int n) throws RemoteException;
    public String procurarProduto(String nome) throws RemoteException;
}
