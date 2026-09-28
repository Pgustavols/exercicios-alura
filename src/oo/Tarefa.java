package oo;

import java.util.ArrayList;
import java.util.List;

public class Tarefa {
    String descricao;
    boolean concluida;

    public Tarefa(String descricao, boolean concluida){
        this.descricao = descricao;
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        String status = concluida ? "Concluída" : "Pendente";
        return "Tarefa: "+descricao + " - Status: "+status;
    }

    public static void main(String[] args) {
        List<Tarefa> tarefas = new ArrayList<>();

        Tarefa t1 = new Tarefa("Estudar Java", true);
        Tarefa t2 = new Tarefa("Estudar PHP", false);

        tarefas.add(t1);
        tarefas.add(t2);

        tarefas.forEach(System.out::println);
    }
}
