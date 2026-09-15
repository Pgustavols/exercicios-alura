package condicionais;

import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args) {
        String senha = "123456";

        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Digite a senha: ");
            String senhaDigitada = sc.nextLine();
            if(senha.equals(senhaDigitada)){
                System.out.println("Acesso permitido!");
            }else{
                System.out.println("Acesso negado!");
            }
        }
    }
}
