package colecoesestreams;

import java.util.ArrayList;
import java.util.List;

public class AcessaElementos {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>(List.of("João", "Maria", "Ana", "Pedro", "Antônio"));

        System.out.println("A segunda pessoa da lista é: "+funcionarios.get(1));
        System.out.println("Total de funcionários: "+funcionarios.size());
    }
}
