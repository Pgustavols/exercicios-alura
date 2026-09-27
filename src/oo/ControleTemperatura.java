package oo;

public class ControleTemperatura {
    String local;
    double temperaturaAtual;

    void exibeCondicoesDeTemperatura(){
        System.out.println("Sensor no local: "+local);
        System.out.printf("Temperatura: %.1f ºC\n", temperaturaAtual);

        if(temperaturaAtual > 37.5){
            System.out.println("Alerta: Temperatura acima do limite!");
        }

    }

    public static void main(String[] args) {
        ControleTemperatura ct = new ControleTemperatura();

        ct.local = "Setor A";
        ct.temperaturaAtual = 39.2;

        ct.exibeCondicoesDeTemperatura();
    }
}
