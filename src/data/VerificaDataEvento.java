package data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class VerificaDataEvento {
    public static void main(String[] args) {
        LocalDate dataEvento = LocalDate.of(2026, 9, 26);
        LocalDate dataAtual = LocalDate.of(2026, 9, 24);

        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data do evento: "+dataEvento.format(formatacao));
        System.out.println("Data atual: "+dataAtual.format(formatacao));

        if(dataEvento.isBefore(dataAtual)){
            long diasPassados = ChronoUnit.DAYS.between(dataEvento, dataAtual);
            System.out.println("O evento ocorreu há "+ diasPassados + " dia(s) atrás.");
        }else if(dataEvento.isEqual(dataAtual)) {
            System.out.println("O evento é hoje.");
        }else{
            long diasParaEvento = ChronoUnit.DAYS.between(dataAtual, dataEvento);
            System.out.println("Falta(m) "+diasParaEvento + " dia(s) para o evento.");
        }
    }
}

