package heranca.pagamento;

import java.math.BigDecimal;

public class Boleto extends Pagamento{
    private final BigDecimal TAXA;
    public Boleto(BigDecimal valor) {
        super(valor);
        this.TAXA = new BigDecimal("0.01");
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Boleto de R$%.2f gerado com sucesso (Taxa: R$%.2f)\n", getValor(), getValor().multiply(TAXA));
    }
}
