package heranca.sistemabancario;

import java.math.BigDecimal;

public abstract class OperacaoBancaria implements AcaoBancaria{
    private BigDecimal valor;

    public OperacaoBancaria(BigDecimal valor){
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    @Override
    public abstract void executar();
}
