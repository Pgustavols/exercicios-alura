package colecoesestreams;

import oo.Tarefa;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CalculaQuadradoNumero {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);

        List<Integer> quadrados = numeros.stream().map(numero -> numero * numero).toList();

        System.out.println("Quadrados dos números: " + quadrados);
    }
}
