package Caso6_Composite;

public class ValidadorContrase�a implements IValidator {
    @Override
    public String validate(InformacionUsuario informacionUsuario) {
        String res = "";
        String contrase�a = informacionUsuario.getContrase�a();

        if(contrase�a.equals("")) res += "La contrase�a no es valida" + "\n";

        return res;
    }
}
