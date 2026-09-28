package oo;

public class Colaborador {
    String nome;
    String cargo;
    int nivelAcesso;

    void alteraCargoENivelAcesso(String novoCargo, int novoNivelAcesso){
        System.out.println("--- Antes da atualização ---");
        System.out.println("Nome: "+nome);
        System.out.println("Cargo: "+cargo);
        System.out.println("Nível de acesso: "+nivelAcesso);

        cargo = novoCargo;
        nivelAcesso = novoNivelAcesso;

        System.out.println("\n--- Após atualização ---");
        System.out.println("Nome: "+nome);
        System.out.println("Cargo: "+cargo);
        System.out.println("Nível de acesso: "+nivelAcesso);

    }


    public static void main(String[] args) {
        Colaborador c = new Colaborador();
        c.nome = "Júlia Oliveira";
        c.cargo = "Pessoa Desenvolvedora Pleno";
        c.nivelAcesso = 2;

        c.alteraCargoENivelAcesso("Pessoa Denvolvedora Sênior", 3);
    }
}
