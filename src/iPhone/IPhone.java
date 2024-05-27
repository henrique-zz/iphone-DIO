package iPhone;

import aplicativos.musica.ReprodutorMusical;
import aplicativos.musica.Spotify;
import aplicativos.musica.YoutubeMusic;
import aplicativos.navegadores.Chrome;
import aplicativos.navegadores.NavegadorInternet;
import aplicativos.navegadores.Safari;
import aplicativos.telefone.AparelhoTelefonico;
import aplicativos.telefone.AplicativoTelefone;

public class IPhone {
    public static void main(String[] args){
        ReprodutorMusical spotify = new Spotify();
        spotify.pausar();
        spotify.tocar();
        spotify.selecionarMusica("Lithium");

        System.out.println();

        ReprodutorMusical youtubeMusic = new YoutubeMusic();
        youtubeMusic.pausar();
        youtubeMusic.tocar();
        youtubeMusic.selecionarMusica("Lithium");

        System.out.println();

        NavegadorInternet chrome = new Chrome();
        chrome.adicionarNovaAba();
        chrome.atualizarAba();
        chrome.exibirPagina("www.google.com");

        System.out.println();

        NavegadorInternet safari = new Safari();
        safari.adicionarNovaAba();
        safari.atualizarAba();
        safari.exibirPagina("www.google.com");

        System.out.println();

        AparelhoTelefonico aparelhoTelefonico = new AplicativoTelefone();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
        aparelhoTelefonico.ligar("9999-9999");

    }
}