package stringregex;

import java.util.Scanner;

public class VerificaSeExisteString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Digite o texto: ");
            String texto = sc.nextLine().trim();

            System.out.print("Digite a palavra: ");
            String palavra = sc.nextLine().trim();

            if(texto.contains(palavra)){
                System.out.println("A palavra \""+palavra+"\"" + " está presente no texto.");
            }else{
                System.out.println("A palavra não está presente no texto.");
            }
        }
    }
}
