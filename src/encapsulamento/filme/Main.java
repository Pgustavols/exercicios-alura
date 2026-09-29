package encapsulamento.filme;

public class Main {
    public static void main(String[] args) {
        Filme matrix = new Filme("Matrix");
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(4);
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(3);
        matrix.adicionarAvaliacao(4);

        matrix.exibeMediaAvaliacoes();

    }
}
