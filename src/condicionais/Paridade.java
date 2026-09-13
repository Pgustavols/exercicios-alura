package condicionais;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Paridade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        if(numero % 2 != 0){
            System.out.println("O número "+numero + " é ímpar.");
        }else{
            System.out.println("O número "+numero + " é par.");
        }
    }
}
