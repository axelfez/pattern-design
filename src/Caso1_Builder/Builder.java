package Caso1_Builder;

public class Builder {


    public static void main(String[] args) {
        Herrero h = new Herrero();

        ArmaBuilder dagasConcreteBuilder = new DagasConcreteBuilder();
        ArmaBuilder armasConcreteBuilder = new ArmasConcreteBuilder();

        h.setArmaBuilder(dagasConcreteBuilder);
        h.constructArma();
        Arma a = h.getArma();

        System.out.println("Arma Creada: " + a.toString());

        h.setArmaBuilder(armasConcreteBuilder);
        h.constructArma();
        a = h.getArma();

        System.out.println("Arma Creada: " + a.toString());

    }
}
