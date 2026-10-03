package heranca.notificacao;

public class Email extends Notificacao{
    private String assunto;

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }


    @Override
    public void enviar() {
        System.out.println("Enviando Email para: "+getDestinatario());
        System.out.println("Assunto: "+this.assunto);
        System.out.printf("Corpo: %s\n\n\n",getMensagem());
    }
}
