package heranca.reserva;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Reserva reserva = new Reserva();
        reserva.reservar();
        reserva.reservar(LocalDate.parse("2026-02-03"));
        reserva.reservar(LocalDate.parse("2026-02-03"), 2);

        Reserva vip = new ReservaVip();
        vip.reservar();
    }
}
