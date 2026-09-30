package encapsulamento.notas;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Double> notas = new ArrayList<>();

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public void adicionarNota(double nota){
        if(nota >= 0 && nota <= 10){
            this.notas.add(nota);
        }else{
            System.out.printf("Nota inválida ignorada: %.1f\n",nota);
        }
    }

    private int calculaTotalNotas(){
        return notas.size();
    }

    private double calculaMedia(){
        double soma = 0;
        for(double nota: notas){
            soma += nota;
        }
        return soma / notas.size();
    }

    public void exibeMediaETotalNotas(){
        System.out.printf("Total de notas válidas: %d\n", this.calculaTotalNotas());
        System.out.printf("Média em %s: %.2f", this.nome, this.calculaMedia());
    }
}
