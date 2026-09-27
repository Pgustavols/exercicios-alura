package oo;

public class Livro {
    String titulo;
    String autor;
    int paginas;

    void exibeResumoLivro(){
        System.out.printf("\"%s\" de %s com %d páginas.", titulo, autor, paginas);

    }

    public static void main(String[] args) {
        Livro l = new Livro();
        l.titulo = "O Apanhador no Campo de Centeio";
        l.autor = "J. D. Salinger";
        l.paginas = 234;

        l.exibeResumoLivro();
    }
}
