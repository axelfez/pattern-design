package Caso6_Composite;

public class ValidadorEdad implements IValidator {


    @Override
    public String validate(InformacionUsuario informacionUsuario) {
        int edad = informacionUsuario.getEdad();
        String res = "";
        if(edad < 18) res += "El usuario debe ser mayor de edad" + "\n";
        return res;
    }
}
