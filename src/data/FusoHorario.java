package data;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FusoHorario {
    public static void main(String[] args) {

        ZonedDateTime horarioLondres = ZonedDateTime.now(ZoneId.of("Europe/London"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horarioLondresFormatado = horarioLondres.format(formatter);

        System.out.println("Horário atual em Londres: "+horarioLondresFormatado);
    }
}
