public class Reprodutor {
    private Musica musica;

    public Musica getMusica() {
        return musica;
    }

    public void selecionar(Musica musica) {
        this.musica = musica;
    }

    public void tocar(Musica musica){

    }

    public Reprodutor(Musica musica) {
        this.musica = musica;
    }
}
