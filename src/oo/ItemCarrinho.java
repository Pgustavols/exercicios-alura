package oo;

import java.util.ArrayList;
import java.util.List;

public class ItemCarrinho {
    String nome;
    double preco;
    int quantidade;

    public ItemCarrinho(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public static void main(String[] args) {
        ItemCarrinho i1 = new ItemCarrinho("Teclado", 120.0, 1);
        ItemCarrinho i2 = new ItemCarrinho("Mouse", 70.0, 2);

        List<ItemCarrinho> listaCompras = new ArrayList<>();
        listaCompras.add(i1);
        listaCompras.add(i2);

        double totalCompra = 0;
        for (ItemCarrinho item: listaCompras){
            totalCompra += (item.preco * item.quantidade);
        }

        System.out.printf("Total da compra: R$ %.2f\n", totalCompra);
    }
}
