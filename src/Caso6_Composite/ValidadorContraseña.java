package Caso6_Composite;

public class ValidadorContrase�a implements IValidator {
    @Override
    public String validate(Informaci�nUsuario informaci�nUsuario) {
        String res = "";
        String contrase�a = informaci�nUsuario.getContrase�a();

        if(contrase�a.equals("")) res += "La contrase�a no es valida" + "\n";

        return res;
    }
}
