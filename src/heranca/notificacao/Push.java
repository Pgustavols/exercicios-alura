package heranca.notificacao;

public class Push extends Notificacao{
    private String titulo;
    public Push(String destinatario, String mensagem, String titulo) {
        super(destinatario, mensagem);
        this.titulo = titulo;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Push para: "+getDestinatario());
        System.out.println("Título: "+this.titulo);
        System.out.printf("Conteúdo: %s\n\n\n",getMensagem());
    }
}
