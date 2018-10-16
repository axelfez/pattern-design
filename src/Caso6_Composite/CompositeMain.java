package Caso6_Composite;

public class CompositeMain {

    public static void main(String[] args) {
        IValidator validator = new ValidatorComposite();


        Localizacion localizacion = new Localizacion("", 0, "", "");
        Informaci�nUsuario informaci�nUsuario = new Informaci�nUsuario("", 15, localizacion, "" );



        String res = validator.validate(informaci�nUsuario);

        System.out.println(res);

        localizacion = new Localizacion("aobm@gmail.com", 40301, "Santo Domingo", "Costa Rica");
        informaci�nUsuario = new Informaci�nUsuario("Andres Brenes", 20, localizacion, "HolaMundo" );

        res = validator.validate(informaci�nUsuario);
        
        System.out.println(res);

    }
}
