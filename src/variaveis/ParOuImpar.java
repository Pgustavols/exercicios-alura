package variaveis;

public class ParOuImpar {
    public static void main(String[] args) {
        int numero = 8;
        String paridade;

        if(numero % 2 == 0){
            paridade = "par";
        }else{
            paridade = "ímpar";
        }

        System.out.println("O número é "+paridade);
    }
}
