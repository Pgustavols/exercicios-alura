package encapsulamento.aluno;

public class Aluno {
    private String nome;
    private int pontos = 0;
    private int nivel = 1;

    public Aluno(String nome){
        this.nome = nome;
    }

    public void ganharPontos(int pontos){
        if(pontos > 0) {
            this.pontos += pontos;
            this.calculaNivel();
        }else {
            throw new IllegalArgumentException("A quantidad de pontos deve ser maior que zero.");
        }
    }

    private int calculaNivel(){
        this.nivel = (int) Math.ceil(pontos / 100.0);
        return this.nivel;
    }

    public void exibirStatus(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Pontos: "+this.pontos);
        System.out.println("Nível: "+this.nivel);
    }
}
