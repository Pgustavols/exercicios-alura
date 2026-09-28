package oo;

public class Aluno {
    String nome;
    double nota1;
    double nota2;

    void mostrarResultado(){
        double media = (nota1 + nota2) / 2;

        System.out.println("Aluno: "+nome);
        System.out.println("Nota 1: "+nota1);
        System.out.println("Nota 2: "+nota2);
        System.out.printf("Média: %.1f\n",media);

        if(media >= 7){
            System.out.println("Situação: Aprovado");
        }else{
            System.out.println("Situação: Reprovado");
        }
    }

    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nome = "João Silva";
        a.nota1 = 6.5;
        a.nota2 = 7.5;

        a.mostrarResultado();
    }
}
