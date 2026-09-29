package encapsulamento.filme;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nome;
    private List<Integer> listaAvaliacao = new ArrayList<>();

    public Filme(String nome){
        this.nome = nome;
    }

    public void adicionarAvaliacao(int nota){
        if(nota >= 1 && nota <=5){
            listaAvaliacao.add(nota);
        }else{
            System.out.println("Valor inválido");
        }
    }

    private double calculaMedia(){
        double soma = 0;
        for(int nota: listaAvaliacao){
            soma += nota;
        }

        return soma / listaAvaliacao.size();
    }

    public void exibeMediaAvaliacoes(){
        System.out.printf("Média de avaliações para %s: %.2f", this.nome, calculaMedia());
    }
}
