package stringregex;

import java.util.Scanner;

public class RemoveEspacoEmBranco {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine().trim();

            System.out.println("Nome sem espaços: "+nome);
        }
    }
}
