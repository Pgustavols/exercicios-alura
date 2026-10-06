package stringregex;

import java.util.Scanner;

public class ConverteParaMinusculaEMaiuscula {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Digite o texto: ");
            String texto = sc.nextLine().trim();

            String textoEmLetrasMaiusculas = texto.toUpperCase();
            String textoEmLetrasMinusculas = texto.toLowerCase();

            System.out.println("Texto em maiúsculas: "+textoEmLetrasMaiusculas);
            System.out.println("Texto em minúsculas: "+textoEmLetrasMinusculas);
        }
    }
}
