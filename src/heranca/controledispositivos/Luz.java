package heranca.controledispositivos;

public class Luz implements Controlavel{
    private boolean ligado;
    @Override
    public void ligar() {
        if(!ligado){
            this.ligado = true;
            System.out.println("Luz ligada.");
        }else{
            System.out.println("Luz já está ligada.");
        }
    }

    @Override
    public void desligar() {
        if(ligado){
            this.ligado = false;
            System.out.println("Luz desligada.");
        }else{
            System.out.println("Luz já está desligada.");
        }
    }
}
