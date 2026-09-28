package encapsulamento.validacao;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double valor) {
        if (valor >= 0) {
            preco = valor;
        } else {
            System.out.println("Preço inválido.");
        }
    }

}
