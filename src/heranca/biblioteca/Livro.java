package heranca.biblioteca;

public class Livro extends Midia{
    private String autor;

    public Livro(String titulo, int ano, String autor) {
        super(titulo, ano);
        this.autor = autor;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Código: LIB-%s%d | Livro: %s - Autor: %s\n", getTitulo().substring(0, 3), getAno(), getTitulo(), this.autor);
    }
}
