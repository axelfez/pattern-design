package Caso6_Composite;

public class ValidadorLocalizacion implements IValidator {

    @Override
    public String validate(Informaci�nUsuario informaci�nUsuario) {
        Localizacion localizacion = informaci�nUsuario.getLocalizacion();

        String correoElectronico = localizacion.getCorreoElectronico();
        int apartadoPostal = localizacion.getApartadoPostal();
        String ciudad = localizacion.getCiudad();
        String pais = localizacion.getPais();

        String res = "";

        if(correoElectronico.equals("")) res += "El correo electronico debe estar lleno" + "\n";
        if(apartadoPostal == 0) res += "Debe colocar un apartado postal" + "\n";
        if(ciudad.equals("")) res += "El campo ciudad no puede estar vacio" + "\n";
        if(pais.equals("")) res += "El campo pais no puede estar vacio" + "\n";

        return res;
    }
}
