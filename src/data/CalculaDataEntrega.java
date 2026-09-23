package data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculaDataEntrega {
    public static void main(String[] args) {
       LocalDate dataInicio = LocalDate.of(2025, 3, 15);
       int prazo = 15;

       LocalDate dataEntrega = dataInicio.plusDays(prazo);

       DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd-MM-yyyy");
       String dataEntregaFormatada  = dataEntrega.format(formatacao);

        System.out.println("Data de entrega: "+dataEntregaFormatada);
    }
}
