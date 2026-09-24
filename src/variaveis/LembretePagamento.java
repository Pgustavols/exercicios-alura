package variaveis;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LembretePagamento {
    public static void main(String[] args) {
        LocalDate vencimento = LocalDate.of(2026, 5, 30);
        int antecedencia = 5;

        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String lembrete = vencimento.minusDays(antecedencia).format(formatacao);

        System.out.println("Data do lembrete: "+lembrete);
    }
}
