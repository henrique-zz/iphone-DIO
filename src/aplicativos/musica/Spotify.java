package aplicativos.musica;

public class Spotify implements ReprodutorMusical{
    @Override
    public void tocar() {
        System.out.println("Tocando música pelo Spotify.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música pelo Spotify.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println(musica + " selecionada e pronta para tocar pelo Spotify.");
    }
}
