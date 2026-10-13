package colecoesestreams;

import java.util.ArrayList;
import java.util.List;

public class RemoveFuncionario {
    public static void main(String[] args) {
        List<String> listaFuncionarios = new ArrayList<>(List.of("Joana", "Lucas", "Pedro", "Antônio"));
        System.out.println("Lista inicial: "+listaFuncionarios);

        listaFuncionarios.remove("Lucas");

        System.out.println("Lista após a exclusão: "+listaFuncionarios);
    }
}
