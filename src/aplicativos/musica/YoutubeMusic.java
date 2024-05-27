package aplicativos.musica;
public class YoutubeMusic implements ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando música pelo Youtube Music.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música pelo Youtube Music.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println(musica + " selecionada e pronta para tocar pelo Youtube Music.");
    }
}
