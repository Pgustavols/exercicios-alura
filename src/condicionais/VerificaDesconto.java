package condicionais;

import java.math.BigDecimal;
import java.util.Scanner;

public class VerificaDesconto {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Digite o valor da compra: ");
            double valor = sc.nextDouble();
            if(valor >= 100){
                System.out.println("Desconto de 10% aplicado.");
                System.out.println("Novo valor: R$ "+ String.format("%.2f", valor * 90 / 100));

            }else{
                System.out.println("Nenhum desconto aplicado.");
                System.out.println("Valor total: R$ "+String.format("%.2f", valor));
            }
        }
    }
}
