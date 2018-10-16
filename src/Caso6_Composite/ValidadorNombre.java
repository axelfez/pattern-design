package Caso6_Composite;

public class ValidadorNombre implements IValidator{

    @Override
    public String validate(Informaci�nUsuario informaci�nUsuario) {
        String nombre = informaci�nUsuario.getNombre();
        String res = "";
        if(nombre.equals("")) res += "Debe llenar el campo Nombre" + "\n";
        if(nombre.indexOf("1") != -1) res += "El nombre no puede llevar numeros" + "\n";
        return res;
    }
}
