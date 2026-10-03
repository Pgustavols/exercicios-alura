package heranca.pagamento;

import java.math.BigDecimal;

public abstract class Pagamento {
    private BigDecimal valor;

    public BigDecimal getValor() {
        return valor;
    }

    public Pagamento(BigDecimal valor){
        this.valor = valor;
    }

    public abstract void confirmarPagamento();
}
