package Caso6_Composite;

public class InformaciónUsuario {
    private String nombre;
    private int edad;
    private Localizacion localizacion;
    private String contraseña;

    public InformaciónUsuario(String nombre, int edad, Localizacion localizacion, String contraseña){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setLocalizacion(localizacion);
        this.setContraseña(contraseña);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
