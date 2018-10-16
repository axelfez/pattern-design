package Caso6_Composite;

public class ValidadorContraseña implements IValidator {
    @Override
    public String validate(InformacionUsuario informacionUsuario) {
        String res = "";
        String contraseña = informacionUsuario.getContraseña();

        if(contraseña.equals("")) res += "La contraseña no es valida" + "\n";

        return res;
    }
}
