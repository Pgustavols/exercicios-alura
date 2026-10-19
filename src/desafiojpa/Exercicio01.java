package desafiojpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio01 {

    /*Imagine que você tem uma lista de strings.
     Algumas das strings são números, mas outras não. Queremos converter a lista de strings para uma lista de números.
     Se a conversão falhar, você deve ignorar o valor. Por exemplo, na lista a seguir, a saída deve ser [10, 20]:*/
    public static void main(String[] args) {
        List<String> input = Arrays.asList("10", "abc", "20", "30x");

        List<Integer> numeros = new ArrayList<>();

        for(String i : input){
            try{
                int numero = Integer.parseInt(i);
                numeros.add(numero);
            }catch (NumberFormatException ignored){}
        }

        System.out.println(numeros);
    }
}
