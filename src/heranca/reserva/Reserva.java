package heranca.reserva;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private LocalDate dataReserva;
    private int qntPessoas;

    public Reserva() {
    }

    public void reservar(){
        System.out.println("Reserva realizada");
    }

    public void reservar(LocalDate dataReserva){
        this.dataReserva = dataReserva;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Reserva feita para o dia "+dataReserva.format(formatter));
    }

    public void reservar(LocalDate dataReserva, int qntPessoas){
        this.dataReserva = dataReserva;
        this.qntPessoas = qntPessoas;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Reserva feita para o dia "+dataReserva.format(formatter) + " para "+qntPessoas+ " pessoas");
    }


}
