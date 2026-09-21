package repeticao;

import java.util.Scanner;

public class TentativaDeLogin {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int senha = 0;

            for(int i = 3; i > 0; i--){
                System.out.print("Digite a sua senha: ");
                senha = sc.nextInt();
                if(senha != 1234){
                    if(i > 1){
                        System.out.println("Senha incorreta. Você tem "+ (i-1) + " tentativas.");
                    }else {
                        System.out.println("Senha incorreta. Você tem "+ i + " tentativa.");
                    }
                }else{
                    System.out.println("Senha Correta! Acesso concedido!");
                    break;
                }
            }

            if(senha != 1234){
                System.out.println("Conta bloqueada temporariamente.");
            }
        }

    }
}
