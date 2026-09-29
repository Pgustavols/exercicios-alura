package encapsulamento.bateria;

public class Main {
    public static void main(String[] args) {
        Bateria bateria = new Bateria();
        bateria.setNivel(100);
        System.out.println(bateria.exibirStatus());
    }
}
