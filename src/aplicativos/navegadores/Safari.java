package aplicativos.navegadores;

public class Safari implements NavegadorInternet {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Entrando na página " +url+ " pelo Safari.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba pelo Safari.");
    }

    @Override
    public void atualizarAba() {
        System.out.println("Atualizando a aba pelo Safari.");
    }
}
