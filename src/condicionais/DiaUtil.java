package condicionais;

import java.util.Scanner;

public class DiaUtil {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Digite o dia da semana (em letras minúsculas): ");
            String dia = sc.next().toLowerCase();

            if(!dia.equals("sábado") && !dia.equals("domingo")){
                System.out.println(dia.substring(0, 1).toUpperCase() + dia.substring(1) + " é um dia útil");
            }else{
                System.out.println(dia.substring(0, 1).toUpperCase() + dia.substring(1) + " não é um dia útil");
            }
        }
    }
}
