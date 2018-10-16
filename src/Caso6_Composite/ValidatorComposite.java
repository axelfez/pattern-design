package Caso6_Composite;

import java.util.ArrayList;

public class ValidatorComposite implements IValidator {
    private ArrayList <IValidator> validators;

    public ValidatorComposite (){
        validators = new ArrayList();

        addValidador(new ValidadorNombre());
        addValidador(new ValidadorEdad());
        addValidador(new ValidadorLocalizacion());
        addValidador(new ValidadorContraseña());
    }
    public void addValidador(IValidator validator){
        validators.add(validator);
    }

    @Override
    public String validate(InformacionUsuario informacionUsuario) {
        String res = "";
        for(IValidator validator : validators){
            res += validator.validate(informacionUsuario);
        }
        if(res.equals("")) res = "Todo en orden";

        return res;
    }
}
