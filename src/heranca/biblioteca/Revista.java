package heranca.biblioteca;

public class Revista extends Midia{
    private int edicao;
    public Revista(String titulo, int ano, int edicao) {
        super(titulo, ano);
        this.edicao = edicao;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Código: LIB-%s%d | Revista: %s - Edição: %d\n", getTitulo().substring(0, 3), getAno(), getTitulo(), this.edicao);
    }
}
