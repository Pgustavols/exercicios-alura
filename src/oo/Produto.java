package oo;

import java.math.BigDecimal;

public class Produto {
    String nome;
    BigDecimal preco;
    int quantidade;

    void exibirInformacoes(){
        System.out.println("Produto: "+ nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Quantidade em estoque: "+ quantidade);
    }

    public static void main(String[] args) {
        Produto p = new Produto();
        p.nome = "Mouse gamer";
        p.preco = new BigDecimal("159.900");
        p.quantidade = 25;

        p.exibirInformacoes();
    }
}
