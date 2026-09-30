package encapsulamento.notas;

public class Main {
    public static void main(String[] args) {
        Disciplina sociologia = new Disciplina("Sociologia");

        sociologia.adicionarNota(7.5);
        sociologia.adicionarNota(11.0);
        sociologia.adicionarNota(8.0);
        sociologia.adicionarNota(-3.0);
        sociologia.adicionarNota(9.5);

        sociologia.exibeMediaETotalNotas();

    }
}
