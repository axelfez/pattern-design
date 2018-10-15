package Caso1_Builder;

public class Arma {
    private String nombre;
    private int poder;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Poder: " + poder;
    }
}
