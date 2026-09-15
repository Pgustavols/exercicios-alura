package condicionais;

import java.util.Scanner;

public class ComparacaoNumeros {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Informe o primeiro número: ");
            int num1 = sc.nextInt();

            System.out.print("Informe o segundo número: ");
            int num2 = sc.nextInt();

            if(num1 == num2){
                System.out.println("Ambos são iguais.");
            } else if (num1 > num2) {
                System.out.println("O maior numero é: "+ num1);
            }else{
                System.out.println("O maior numero é: "+ num2);
            }
        }
    }

}
