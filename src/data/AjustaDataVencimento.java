package data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AjustaDataVencimento {
    public static void main(String[] args) {
        LocalDate dataVencimentoOriginal = LocalDate.of(2026, 9, 23);
        int numeroMeses = 1;

        LocalDate dataVencimentoAjustada = dataVencimentoOriginal.plusMonths(numeroMeses);

        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String dataVencimentoAjustadaEFormatada = dataVencimentoAjustada.format(formatacao);

        System.out.println("Nova data de vencimento: "+ dataVencimentoAjustadaEFormatada);

    }
}
