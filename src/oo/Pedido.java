package oo;

public class Pedido {
    String titulo;
    int diasAtraso;

    static final double PRECO_MULTA_POR_DIA = 2.5;

    void exibirDetalhes(){
        double calculaPrecoMulta =  diasAtraso > 0 ? diasAtraso * PRECO_MULTA_POR_DIA : 0;
        System.out.printf("Livro: %s | Multa por %d dia(s) de atraso: R$ %.2f", titulo, diasAtraso, calculaPrecoMulta);
    }

    public Pedido(String titulo, int diasAtraso){
        this.titulo = titulo;
        this.diasAtraso = diasAtraso;
    }
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Harry Potter e a  Pedra Filosofal", 4);
        pedido.exibirDetalhes();
    }
}
