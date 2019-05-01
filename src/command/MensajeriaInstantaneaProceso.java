package Caso2_Command;

public class MensajeriaInstantaneaProceso implements IProceso {
    private MensajeriaInstantanea mensajeriaInstantanea;

    MensajeriaInstantaneaProceso(){
        mensajeriaInstantanea = new MensajeriaInstantanea();
    }

    @Override
    public void ejecutar() {
        mensajeriaInstantanea.enviarMensaje();
    }
}
