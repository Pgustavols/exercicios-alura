package encapsulamento.bateria;

public class Bateria {
    private int nivel;

    public void setNivel(int nivel){
        if(nivel >= 0 && nivel <= 100){
            this.nivel = nivel;
        }else {
            throw new IllegalArgumentException("Valor inválido! O nível deve estar entre 0 e 100.");
        }
    }

    public int getNivel(){
        return this.nivel;
    }

    public String exibirStatus(){
        if(this.nivel <= 20){
            return  "Bateria fraca.";
        }else if(this.nivel <= 79){
            return "Bateria ok.";
        }else{
            return "Bateria cheia.";
        }
    }
}
