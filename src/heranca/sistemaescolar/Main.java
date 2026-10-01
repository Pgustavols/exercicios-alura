package heranca.sistemaescolar;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pedro", 15, 7.5);
        Aluno aluno2 = new Aluno("Lucas", 16, 8.2);

        Docente docente1 = new Docente("Paulo", 45, "História");
        Docente docente2 = new Docente("Gustavo", 38, "Física");

        aluno1.exibirDados();
        aluno2.exibirDados();

        docente1.exibirDados();
        docente2.exibirDados();
    }
}
