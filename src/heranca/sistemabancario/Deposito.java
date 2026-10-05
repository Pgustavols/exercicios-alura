package heranca.sistemabancario;

import java.math.BigDecimal;

public class Deposito extends OperacaoBancaria{

    public Deposito(BigDecimal valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.printf("Depósito de R$%.2f realizado\n", getValor());
    }
}
