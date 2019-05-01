package Caso2_Command;

public class MainCommand {

    public static void main(String[] args) {
        ColaProcesos colaProcesos = new ColaProcesos(10);

        colaProcesos.addProceso(new correoElectronicoProceso());
        colaProcesos.addProceso(new MensajeriaInstantaneaProceso());
        colaProcesos.addProceso(new ReproducirMusicaProceso());
        colaProcesos.addProceso(new GaleriaFotosProceso());

        colaProcesos.ejecutarProcesos();
    }
}
