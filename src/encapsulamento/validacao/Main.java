package encapsulamento.validacao;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Mouse", 59.90);

        System.out.printf("Produto: %s\nPreço: %.2f\n", produto.getNome(), produto.getPreco());
    }
}
