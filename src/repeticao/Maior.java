package repeticao;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int[] numeros = new int[5];

            System.out.println("Digite os números separados por espaço: ");
            for(int i = 0; i < numeros.length; i++){
                numeros[i] = sc.nextInt();
            }
            int maior = numeros[0];

            for(int i = 1; i < numeros.length; i++){
                if(maior < numeros[i]){
                    maior = numeros[i];
                }
            }

            System.out.println("O maior número é: "+maior);
        }
    }
}
