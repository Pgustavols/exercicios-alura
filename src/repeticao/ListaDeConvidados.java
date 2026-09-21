package repeticao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeConvidados {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            List<String> convidados = new ArrayList<>();
            String entrada;

            do{
                System.out.print("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar):");
                entrada = sc.next().trim().toLowerCase();

                if(entrada.equals("sair")){
                    break;
                }

                if(entrada.equals("ver")){
                    System.out.println(convidados);
                    continue;
                }

                final String entradaFinal = entrada;

                boolean existe = convidados.stream()
                        .anyMatch(convidado -> convidado.equalsIgnoreCase(entradaFinal));

                if(existe) {
                    System.out.println("O nome " + entrada + " já está na lista de convidados.");
                }
                else{
                    String nomeFormatado = entrada.substring(0,1).toUpperCase() + entrada.substring(1);
                    convidados.add(nomeFormatado);
                    System.out.println(nomeFormatado + " foi adicionado à lista de convidados.");
                }


            }while(true);
        }
    }
}
