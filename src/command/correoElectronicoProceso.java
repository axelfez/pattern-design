package Caso2_Command;

public class correoElectronicoProceso implements IProceso{

    private CorreoElectronico correoelectronico;

    correoElectronicoProceso(){
        correoelectronico = new CorreoElectronico();
    }

    @Override
    public void ejecutar() {
        correoelectronico.enviarCorreo();
    }
}
