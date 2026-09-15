package condicionais;

import java.util.Scanner;

public class VerificaAprovacao {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Informe a média do aluno: ");
            double media = sc.nextDouble();
            String status;

            if(media >= 7){
                status = "aprovado";
            }else if(media >= 5 && media <= 6.9){
                status = "recuperação";
            }else{
                status = "reprovado";
            }

            System.out.println("O estudante teve média "+String.format("%.1f", media) + ". Status: "+status);
        }
    }
}
