package Caso1_Builder;


/* Concrete Builder */
public class GarroteConcreteBuilder extends ArmaBuilder {


    @Override
    public void setNombre() {
        arma.setNombre("Garrote Sauron");
    }

    @Override
    public void setPower() {
        arma.setPoder(20);
    }
}
