package encapsulamento.conta;

public class ContaUsuario {
    private String login;
    private String senha;

    public ContaUsuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    public boolean validarSenha(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }
}
