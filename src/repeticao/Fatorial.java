package repeticao;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int fatorial = 1;

            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            for(; numero > 1; numero--){
                fatorial *= numero;
            }
            System.out.println("O fatorial de "+numero + " é "+fatorial);
        }
    }
}
