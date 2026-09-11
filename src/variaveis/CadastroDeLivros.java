package variaveis;

import java.math.BigDecimal;

public class CadastroDeLivros {
    public static void main(String[] args) {
        String titulo = "Java para iniciantes";
        String autor = "Herbert Schildt";
        int numeroDePaginas = 668;
        BigDecimal preco = new BigDecimal("171.43");
        char categoria = 'T';

        String categoriaDescricao;
        if(categoria == 'F'){
            categoriaDescricao = "Ficção";
        } else if (categoria == 'N') {
            categoriaDescricao = "Não-Ficção";
        } else if (categoria == 'T') {
            categoriaDescricao = "Tecnologia";
        }else {
            categoriaDescricao = "História";
        }

        System.out.println("Livro cadastrado: "+titulo+ ", de "+autor+ "." +
                " Ele possui "+numeroDePaginas + " páginas, custa R$"+preco + " e pertence à categoria "+categoriaDescricao+".");
    }
}
