package heranca.controledispositivos;

public class Main {
    public static void main(String[] args) {
        Dispositivo luz = new Luz();
        Dispositivo ar = new ArCondicionado();

        luz.ligar();
        luz.ligar();
        luz.desligar();

        ar.desligar();
    }
}
