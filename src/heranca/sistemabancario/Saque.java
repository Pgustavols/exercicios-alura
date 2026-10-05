package heranca.sistemabancario;

import java.math.BigDecimal;

public class Saque extends OperacaoBancaria{
    public Saque(BigDecimal valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.printf("Saque de R$%.2f realizado\n", getValor());
    }
}
