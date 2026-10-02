package heranca.biblioteca;

public class Ebook extends Midia{
    private String formato;

    public Ebook(String titulo, int ano, String formato) {
        super(titulo, ano);
        this.formato = formato;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Código: LIB-%s%d | Ebook: %s - Formato: %s\n", getTitulo().substring(0, 3), getAno(), getTitulo(), this.formato);
    }
}
