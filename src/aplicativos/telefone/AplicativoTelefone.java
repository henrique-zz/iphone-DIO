package aplicativos.telefone;

public class AplicativoTelefone implements AparelhoTelefonico{
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " +numero+ " pelo aplicativo de telefone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação pelo aplicativo de telefone.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz pelo aplicativo de telefone.");
    }
}
