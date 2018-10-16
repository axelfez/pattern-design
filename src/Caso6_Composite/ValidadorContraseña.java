package Caso6_Composite;

public class ValidadorContraseña implements IValidator {
    @Override
    public String validate(InformaciónUsuario informaciónUsuario) {
        String res = "";
        String contraseña = informaciónUsuario.getContraseña();

        if(contraseña.equals("")) res += "La contraseña no es valida" + "\n";

        return res;
    }
}
