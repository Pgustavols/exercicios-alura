package condicionais;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Paridade {
    public static void main(String[] args) {

        System.out.print("Informe um número inteiro: ");

        try (Scanner scanner = new Scanner(System.in)){
            int numero = scanner.nextInt();
            if(numero % 2 != 0){
                System.out.println("O número "+numero + " é ímpar.");
            }else{
                System.out.println("O número "+numero + " é par.");
            }
        }
    }
}
