package heranca.controledispositivos;

public abstract class Dispositivo implements Controlavel {
    private boolean ligado;
    private String nome;

    public Dispositivo(String nome) {
        this.nome = nome;
        this.ligado = false;
    }

    @Override
    public void ligar() {
        if (!ligado) {
            this.ligado = true;
            System.out.println(nome + " ligado(a).");
        } else {
            System.out.println(nome + " já está ligado(a).");
        }
    }

    @Override
    public void desligar() {
        if (ligado) {
            this.ligado = false;
            System.out.println(nome + " desligado(a).");
        } else {
            System.out.println(nome + " já está desligado(a).");
        }
    }

}