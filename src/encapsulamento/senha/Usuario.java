package encapsulamento.senha;

public class Usuario {
    private String senha;

    public Usuario(String senha){
        this.senha = senha;
    }

    public void setUsuario(String senhaAtual, String novaSenha){
        if(this.senha.equals(senhaAtual)){
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        }else{
            System.out.println("Senha atual incorreta. A senha não foi alterada.");
        }
    }
}
