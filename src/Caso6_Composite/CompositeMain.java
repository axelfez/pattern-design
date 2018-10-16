package Caso6_Composite;

public class CompositeMain {

    public static void main(String[] args) {
        IValidator validator = new ValidatorComposite();


        Localizacion localizacion = new Localizacion("", 0, "", "");
        InformaciónUsuario informaciónUsuario = new InformaciónUsuario("", 15, localizacion, "" );



        String res = validator.validate(informaciónUsuario);

        System.out.println(res);

        localizacion = new Localizacion("aobm@gmail.com", 40301, "Santo Domingo", "Costa Rica");
        informaciónUsuario = new InformaciónUsuario("Andres Brenes", 20, localizacion, "HolaMundo" );

        res = validator.validate(informaciónUsuario);
        
        System.out.println(res);

    }
}
