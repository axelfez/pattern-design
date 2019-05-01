package Caso2_Command;

public class ReproducirMusicaProceso implements IProceso {
    private ReproducirMusica reproducirMusica;

    ReproducirMusicaProceso(){
        reproducirMusica = new ReproducirMusica();
    }

    @Override
    public void ejecutar() {
        reproducirMusica.reproducirMusica();
    }
}
