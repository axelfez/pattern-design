package Caso2_Command;

public class GaleriaFotosProceso implements IProceso{
    private GaleriaFotos galeriaFotos;

    GaleriaFotosProceso(){
        galeriaFotos = new GaleriaFotos();
    }


    @Override
    public void ejecutar() {
        galeriaFotos.abrirGaleria();
    }
}
