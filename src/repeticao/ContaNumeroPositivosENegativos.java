package repeticao;

import java.util.Scanner;

public class ContaNumeroPositivosENegativos {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            String numero;
            int quantidadeNumerosImpares = 0;
            int i = 0;
            do{
                System.out.print("Digite um número (ou 'fim' para encerrar): ");
                numero = sc.next().toLowerCase();
                if(numero.contains("-")){
                    quantidadeNumerosImpares++;
                }
                i++;
            }while(!numero.equals("fim"));

            System.out.println("Número positivos: "+ (i - (quantidadeNumerosImpares + 1)));
            System.out.println("Número ímpares: "+ quantidadeNumerosImpares);
        }
    }
}
