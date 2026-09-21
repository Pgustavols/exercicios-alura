package repeticao;

import java.util.Scanner;

public class ContaNumeroPositivosENegativos {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            String entrada;
            int positivo = 0;
            int negativo = 0;
            int neutro = 0;

            do{
                System.out.print("Digite um número (ou 'fim' para encerrar): ");
                entrada = sc.next().toLowerCase().trim();

                if(entrada.equals("fim")){
                    break;
                }

                try{
                    int numero = Integer.parseInt(entrada);

                    if(numero > 0){
                        positivo++;
                    }else if(numero == 0){
                        neutro++;
                    }else{
                        negativo++;
                    }
                }catch (NumberFormatException e){
                    System.out.println("Entrada inválida. Digite um número inteiro.");
                }

            }while(true);

            System.out.println("Número positivos: "+ positivo);
            System.out.println("Número negativos: "+ negativo);
            System.out.println("Quantidade de zeros: "+neutro);
        }

    }
}
