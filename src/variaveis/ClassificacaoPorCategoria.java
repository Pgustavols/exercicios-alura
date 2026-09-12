package variaveis;

import java.math.BigDecimal;

public class ClassificacaoPorCategoria {
    public static void main(String[] args) {
        BigDecimal preco = new BigDecimal("50.00");

        String categoria;

        if(preco.compareTo(new BigDecimal("50.00")) <= 0){
            categoria = "Econômico";
        } else if (preco.compareTo(new BigDecimal("50.00")) > 0 && preco.compareTo(new BigDecimal("200.00")) <= 0) {
            categoria = "Intermediário";
        }else{
            categoria = "Premium";
        }

        System.out.println("Categoria do produto: "+categoria);

    }

}
