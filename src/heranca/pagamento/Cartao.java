package heranca.pagamento;

import java.math.BigDecimal;

public class Cartao extends Pagamento{
    private final BigDecimal TAXA;
    public Cartao(BigDecimal valor) {
        super(valor);
        this.TAXA =  new BigDecimal("0.03");
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Pagamento de R$%.2f confirmado no Cartão de Crédito (Taxa: R$%.2f)\n", getValor(), getValor().multiply(TAXA));
    }
}
