package colecoesestreams;

import java.util.List;
import java.util.Optional;

public class CalculaImposto {
    public static void main(String[] args) {
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        Optional<Double> precoTotal = precosProdutos.stream().reduce(Double::sum);

        double precoTotalComImposto = precoTotal.get() * 1.08;

        System.out.printf("Valor total antes do imposto: R$%.2f\n", precoTotal.get());
        System.out.printf("Valor total com imposto de 8: R$%.2f\n", precoTotalComImposto);

    }
}
