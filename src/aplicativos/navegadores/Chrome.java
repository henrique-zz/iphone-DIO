package aplicativos.navegadores;

public class Chrome implements NavegadorInternet{
    @Override
    public void exibirPagina(String url) {
        System.out.println("Entrando na página " +url+ " pelo Chrome.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba pelo Chrome.");
    }

    @Override
    public void atualizarAba() {
        System.out.println("Atualizando a aba pelo Chrome.");
    }
}
