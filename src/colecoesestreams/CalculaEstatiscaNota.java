package colecoesestreams;

import java.util.List;
import java.util.Optional;

public class CalculaEstatiscaNota {
    public static void main(String[] args) {
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);
        double soma = notas.stream().reduce(0.0, Double::sum);
        double menor = notas.stream().min(Double::compare).get();
        double maior = notas.stream().max(Double::compare).get();

        double media = soma / notas.size();

        System.out.printf("A média das notas é: %.2f\n", media);
        System.out.printf("A menor das notas é: %.2f\n", menor);
        System.out.printf("A maior das notas é: %.2f\n", maior);
    }
}
