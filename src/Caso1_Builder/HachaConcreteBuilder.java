package Caso1_Builder;

/* Concrete Builder */
public class HachaConcreteBuilder extends ArmaBuilder {


    @Override
    public void setNombre() {
        arma.setNombre("Hacha Enanos");
    }

    @Override
    public void setPower() {
        arma.setPoder(3);
    }
}
