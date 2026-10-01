package heranca.aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria", "regular");
        Bolsista bolsista = new Bolsista("João");

        aluno.identificar();
        bolsista.identificar();
    }
}
