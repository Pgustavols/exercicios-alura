package heranca.controledispositivos;

public class Main {
    public static void main(String[] args) {
        Controlavel luz = new Luz();
        Controlavel ar = new ArCondicionado();

        luz.ligar();
        luz.ligar();
        luz.desligar();

        ar.desligar();
    }
}
