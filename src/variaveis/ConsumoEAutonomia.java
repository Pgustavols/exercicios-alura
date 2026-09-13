package variaveis;

public class ConsumoEAutonomia {
    public static void main(String[] args) {
        double consumoMedio = 12.5;
        double capacidadeDoTanque = 50;
        double combustivelAtual = 20;
        double distanciaViagem = 200;

        double autonomiaMaxima = consumoMedio * capacidadeDoTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        System.out.println("A autonomia máxima do veículo: "+String.format("%.1f", autonomiaMaxima)+ " km");
        System.out.println("A autonomia atual: "+String.format("%.1f", autonomiaAtual) + " km");
        if(distanciaViagem <= autonomiaAtual){
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
        }else{
            double distanciaRestante = distanciaViagem - autonomiaAtual;
            double dicaAbastecimento = (distanciaRestante / consumoMedio) + 1;
            System.out.println("Você não conseguirá completar a viagem sem precisar abastecer. " +
                    "É preciso abaster com, pelo menos, "+String.format("%.2f", dicaAbastecimento)+" Litros.");
        }
    }
}
