package trabalhoSD;

import java.rmi.*;
import java.util.Scanner;


public class RMICliente {
    public static void main(String args[]) {
        int opc = 1;
        Interface_remota teste = null;
        Scanner sc = new Scanner(System.in);
        try {
            teste = (Interface_remota) Naming.lookup("//localhost/Interface_remota");
            System.out.println("Server achado");
            while (opc != 0){
                System.out.println("Escolha uma das opções a seguir:\n" +
                        "1- Mostrar todos os produtos\n" +
                        "2- Solicitar a encomenda de um produto\n" +
                        "3- Marcar horário para uma visita presecial\n" +
                        "4- Procurar um produto pelo nome\n" +
                        "0- Para encerrar o serviço");
                opc = Integer.valueOf(sc.nextLine());
                switch (opc) {
                    case 1:
                        System.out.println(teste.mostrarProdutos());
                        break;
                    case 2:
                        System.out.println(teste.venderProduto(sc.nextLine()));
                        break;
                    case 3:
                        System.out.println(teste.marcarHora(Integer.valueOf(sc.nextLine())));
                        break;
                    case 4:
                        System.out.println(teste.procurarProduto(sc.nextLine()));
                        break;
                }
            }

        } catch(Exception e) {System.out.println("Lookup: " + e.getMessage());}
        sc.close();

    }
}
