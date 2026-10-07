package stringregex;

import java.util.Scanner;


public class ExtrairParteString {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Digite o nome do arquivo: ");
            String nomeArquivo = sc.nextLine().trim();

            int posicaoPonto = nomeArquivo.lastIndexOf(".");

            if(posicaoPonto == -1){
                System.out.println("O arquivo não possui extensão");
            }else{
                System.out.println("Nome do arquivo sem extensão: "+nomeArquivo.substring(0, posicaoPonto));
            }
        }
    }
}

