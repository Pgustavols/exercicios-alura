package data;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConverteParaFusoHorario {
    public static void main(String[] args) {
        ZonedDateTime horarioSistema = ZonedDateTime.now();
        ZonedDateTime horarioSydney = horarioSistema.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Horário atual no sistema: "+horarioSistema.format(formatacao));
        System.out.println("Horário atual em Sydney: "+horarioSydney.format(formatacao));
    }
}
