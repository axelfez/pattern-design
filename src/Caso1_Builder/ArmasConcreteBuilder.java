package Caso1_Builder;

public class ArmasConcreteBuilder extends ArmaBuilder {


    @Override
    public void setNombre() {
        arma.setNombre("Armas Orcos");
    }

    @Override
    public void setPower() {
        arma.setPoder(10);
    }
}
