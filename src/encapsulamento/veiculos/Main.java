package encapsulamento.veiculos;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Gol", "ABC-1234", 2020);

        System.out.println("Veículo cadastrado: ");
        System.out.println("Modelo: "+carro.getModelo());
        System.out.println("Placa: "+carro.getPlaca());
        System.out.println("Ano: "+carro.getAno());
    }
}
