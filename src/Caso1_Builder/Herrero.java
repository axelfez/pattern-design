package Caso1_Builder;

/* Director */
public class Herrero {

    private ArmaBuilder armaBuilder;

    public void setArmaBuilder(ArmaBuilder armaBuilder) {
        this.armaBuilder = armaBuilder;
    }

    public Arma getArma(){
        return armaBuilder.getArma();
    }

    public void constructArma(){
        armaBuilder.crearArma();
        armaBuilder.setNombre();
        armaBuilder.setPower();
    }
}
