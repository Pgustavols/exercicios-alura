package variaveis;

public class VerificaIdade {
    public static void main(String[] args) {
        int idade = 18;
        String mensagem;

        if(idade >= 18){
            mensagem = "Você atingiu a maioridade";
        }else{
            mensagem = "Você não atingiu a maioridade";
        }

        System.out.println(mensagem);
    }
}
