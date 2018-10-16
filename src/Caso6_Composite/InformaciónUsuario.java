package Caso6_Composite;

public class Informaci�nUsuario {
    private String nombre;
    private int edad;
    private Localizacion localizacion;
    private String contrase�a;

    public Informaci�nUsuario(String nombre, int edad, Localizacion localizacion, String contrase�a){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setLocalizacion(localizacion);
        this.setContrase�a(contrase�a);
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

    public String getContrase�a() {
        return contrase�a;
    }

    public void setContrase�a(String contrase�a) {
        this.contrase�a = contrase�a;
    }
}
