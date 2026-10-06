package stringregex;

import java.util.Scanner;

public class SubstituiString {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Digite o texto: ");
            String texto = sc.nextLine();

            System.out.print("Digite a palavra a ser substituída: ");
            String palavra = sc.nextLine();

            if(texto.contains(palavra)){
                System.out.print("Digite a nova palavra: ");
                String novaPalavra = sc.nextLine();

                String textoFormatado = texto.replace(palavra, novaPalavra);

                System.out.println("Texto modificado: "+textoFormatado);
            }else{
                System.out.println("A palavra não existe no texto");
            }
        }
    }
}
