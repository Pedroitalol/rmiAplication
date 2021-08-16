package trabalhoSD;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class umaLoja extends UnicastRemoteObject implements Interface_remota{
    private Loja loja;

    public umaLoja() throws RemoteException{
        super();
        this.loja = criarLoja();
    }

    // Cria uma loja qualquer para fazer os testes:
    static Loja criarLoja() {
        Loja temp = new Loja(10);
        // Add livros exemplos
        temp.addLivro(new Produto("O ladrão de relampagos", 0, 1));
        temp.addLivro(new Produto("Cinquenta tons de roxo", 1,1));
        temp.addLivro(new Produto("Harry porco", 2, 5));
        temp.addLivro(new Produto("A menina que roubava tabletes", 3, 3));
        temp.addLivro(new Produto("The waking ned", 4, 10));
        // Zerando a quantidade de agendamentos para certas horas:
        for(int i = 0; i < 9; i++){
            temp.mudarHorario(2);
            temp.mudarHorario(4);
            temp.mudarHorario(9);
        }
        temp.mudarHorario(2);
        return temp;
    }

    public String venderProduto(String nome) throws RemoteException{
        return this.loja.vender(nome);
    }

    public String marcarHora(int n) throws RemoteException{
        return this.loja.mudarHorario(n);
    }

    public String mostrarProdutos() throws RemoteException{
        return this.loja.toString();
    }

    public String procurarProduto(String nome) throws RemoteException{
        return this.loja.acharProduto(nome);
    }

    public String testeDeString(String a) throws RemoteException{
        if(a == "a"){
            return "sim";
        }else if(a.equals("a")){
            return "sim";
        }
        return "não";
    }

}
