package oo;

import java.math.BigDecimal;

public class Produto {
    String nome;
    BigDecimal preco;
    int quantidade;

    public static void main(String[] args) {
        Produto p = new Produto();
        p.nome = "Mouse gamer";
        p.preco = new BigDecimal("159.90");
        p.quantidade = 25;

        System.out.println("Produto: "+p.nome);
        System.out.println("Preço: "+p.preco);
        System.out.println("Quantidade em estoque: "+p.quantidade);
    }
}
