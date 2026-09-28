package encapsulamento.agenda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contato> contatos = new ArrayList<>();

        contatos.add(new Contato("Maria Oliveira", "(11) 94521-4578"));
        contatos.add(new Contato("Roberto Souza", "(11) 95461-1298"));
        contatos.add(new Contato("João Martins", "(11) 98945-3465"));

        for (int i = 0; i < contatos.size(); i++){
            System.out.println(i+1+ ". "+contatos.get(i));
        }
    }
}
