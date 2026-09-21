package repeticao;

import java.util.Scanner;

public class PularNumeros {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            for (int i = 1; i <= numero; i++){
                if(i % 10 == 5){
                    continue;
                }
                System.out.print(i + " ");
            }
        }
    }
}
