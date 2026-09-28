package oo;

public class Item {
    String nome;
    int quantidade;

    public Item(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    void vender(int quantidade){
        if(this.quantidade >= quantidade){
            this.quantidade -= quantidade;
            System.out.printf("Venda realizada. Estoque restante de %s: %d\n", nome, this.quantidade);
        }else{
            System.out.println("Estoque insuficiente.");
        }
    }

    public static void main(String[] args) {
        Item item = new Item("Camiseta", 10);

        item.vender(3);
        item.vender(5);
        item.vender(5);
    }
}
