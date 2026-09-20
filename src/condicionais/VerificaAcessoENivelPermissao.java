package condicionais;

import java.util.Scanner;

public class VerificaAcessoENivelPermissao {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Digite o código de acesso: ");
            int codigo = sc.nextInt();

            System.out.print("Digite o nível de permissão: ");
            int nivel = sc.nextInt();

            boolean nivelValido = nivel >= 1 && nivel <= 3;
            boolean codigoValido = codigo == 2023;

            if(codigoValido && nivelValido){
                System.out.println("Acesso permitido. Bem-vindo ao sistema!");
            }else{
                String mensagem = "Acesso negado: ";
                if(!codigoValido && nivelValido){
                    mensagem += "Código inválido.";
                } else if(codigoValido && !nivelValido){
                    mensagem += "Nível inválido.";
                }else{
                    mensagem += "Código e nível inválidos.";
                }

                System.out.println(mensagem);
            }
        }
    }
}
