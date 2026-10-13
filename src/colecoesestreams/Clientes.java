package colecoesestreams;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Clientes {
    public static void main(String[] args) {
        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(2, "Pedro");
        clientes.put(1, "Maria");
        clientes.put(3, "José");

        System.out.println("O nome do cliente com o ID 2 é: "+clientes.get(2));
    }
}
