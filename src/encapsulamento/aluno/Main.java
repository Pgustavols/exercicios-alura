package encapsulamento.aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João");
        aluno.ganharPontos(1);
        aluno.exibirStatus();
    }
}
