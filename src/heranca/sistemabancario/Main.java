package heranca.sistemabancario;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        OperacaoBancaria deposito = new Deposito(new BigDecimal("200"));
        OperacaoBancaria saque = new Saque(new BigDecimal("50"));

        deposito.executar();
        saque.executar();

    }
}
