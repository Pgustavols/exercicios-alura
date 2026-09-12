package variaveis;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        BigDecimal valorReais = new BigDecimal("451.50");
        BigDecimal valorDolares = valorReais.divide(new BigDecimal("5.25"), 2, RoundingMode.HALF_EVEN);

        System.out.println("O valor em dólares é: US$"+valorDolares);
    }
}
