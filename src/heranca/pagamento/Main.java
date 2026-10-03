package heranca.pagamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Pagamento cartao = new Cartao(new BigDecimal("250"));
        Pagamento boleto = new Boleto(new BigDecimal("500"));
        Pagamento pix = new Pix(new BigDecimal("300"));

        cartao.confirmarPagamento();
        boleto.confirmarPagamento();
        pix.confirmarPagamento();
    }
}
