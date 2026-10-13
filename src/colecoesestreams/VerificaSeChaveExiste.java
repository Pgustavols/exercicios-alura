package colecoesestreams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VerificaSeChaveExiste {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            Map<Integer, String> clientes = new HashMap<>();

            clientes.put(1, "Maria");
            clientes.put(2, "Marcos");
            clientes.put(3, "Ana");
            clientes.put(4, "Joana");
            clientes.put(5, "Karen");

            System.out.print("Informe o id do cliente que você deseja buscar: ");
            int idCliente = sc.nextInt();

            if(clientes.get(idCliente) == null){
                System.out.printf("Cliente com ID %d não encontrado. \n", idCliente);
            }else{
                System.out.printf("O nome do cliente com ID %d é: %s\n", idCliente, clientes.get(idCliente));
            }
        }
    }
}
