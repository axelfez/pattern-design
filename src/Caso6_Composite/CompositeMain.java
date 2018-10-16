package Caso6_Composite;

public class CompositeMain {

    public static void main(String[] args) {
        IValidator validator = new ValidatorComposite();


        Localizacion localizacion = new Localizacion("", 0, "", "");
        InformacionUsuario informacionUsuario = new InformacionUsuario("", 15, localizacion, "" );



        String res = validator.validate(informacionUsuario);

        System.out.println(res);

        localizacion = new Localizacion("aobm@gmail.com", 40301, "Santo Domingo", "Costa Rica");
        informacionUsuario = new InformacionUsuario("Andres Brenes", 20, localizacion, "HolaMundo" );

        res = validator.validate(informacionUsuario);

        System.out.println(res);

    }
}
