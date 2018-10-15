package Caso1_Builder;

/* Concrete Builder */
public class DagasConcreteBuilder extends ArmaBuilder {


    @Override
    public void setNombre() {
        arma.setNombre("Dagas �lficas");
    }

    @Override
    public void setPower() {
        arma.setPoder(5);
    }
}
