package data;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class DiferencaHoras {
    public static void main(String[] args) {
        LocalTime inicioTarefa = LocalTime.of(2, 15);
        LocalTime terminoTarefa = LocalTime.of(5, 30);

        Duration calculaDuracao = Duration.between(inicioTarefa, terminoTarefa);

        LocalTime duracao = LocalTime.of((int) calculaDuracao.toHours(), calculaDuracao.toMinutesPart());

        System.out.println("A tafera demorou "+duracao);
    }
}
