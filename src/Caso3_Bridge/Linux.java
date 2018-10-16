package Caso3_Bridge;

import java.util.Random;

public class Linux extends SistemaOperativo {

    public Linux(){
        System.out.println("Se utiliza Linux");
    }

    @Override
    public void manejarProcesos() {
        int rand = new Random().nextInt(100);
        if(rand < 45){
            esquema = new TimeSlicedScheduler();
            esquema.manageProcess();
        } else{
            esquema = new PreemtiveScheduler();
            esquema.manageProcess();
        }

    }
}
