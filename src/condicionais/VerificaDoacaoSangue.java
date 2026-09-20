package condicionais;

import java.util.Scanner;

public class VerificaDoacaoSangue {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Digite a idade do doador: ");
            int idade = sc.nextInt();

            System.out.print("Digite o peso do doador: ");
            double peso = sc.nextDouble();

            boolean idadeCompativel = idade >= 18 && idade <= 65;
            boolean pesoCompativel = peso > 50;

            if(idadeCompativel && pesoCompativel){
                System.out.println("O doador é compatível");
            }else{
                String motivo = "Motivo: ";
                System.out.println("O doador não é compatível");
                if(!idadeCompativel && pesoCompativel){
                    motivo += "Deve ter entre 18 e 65 anos";
                }else if(!pesoCompativel && idadeCompativel){
                    motivo += "Deve ter o peso maior que 50 kg";
                }else{
                    motivo += "Deve ter entre 18 e 65 anos e peso maior que 50 kg";
                }

                System.out.println(motivo);
            }
        }
    }
}
