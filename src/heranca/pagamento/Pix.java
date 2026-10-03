package heranca.pagamento;

import java.math.BigDecimal;

public class Pix extends Pagamento{
    public Pix(BigDecimal valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Pagamento via Pix de R$%.2f confirmado\n", getValor());
    }
}
