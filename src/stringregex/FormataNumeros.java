package stringregex;

import java.util.Scanner;

public class FormataNumeros {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Digite o valor: ");
            double valor = sc.nextDouble();

            System.out.printf("Valor formatado: R$%.2f", valor);
        }
    }
}
