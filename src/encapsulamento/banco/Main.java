package encapsulamento.banco;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("João", new BigDecimal("100"));
        conta.depositar(new BigDecimal("100"));
        conta.sacar(new BigDecimal("150"));
    }
}
