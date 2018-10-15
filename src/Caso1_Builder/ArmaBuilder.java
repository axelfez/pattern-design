package Caso1_Builder;

public abstract class ArmaBuilder {
    protected Arma arma;

    public Arma getArma(){
        return arma;
    }

    public void crearArma(){
        arma = new Arma();
    }

    public abstract void setNombre();

    public abstract void setPower();
}