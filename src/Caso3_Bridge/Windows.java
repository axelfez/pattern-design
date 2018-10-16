package Caso3_Bridge;

import java.util.Random;

public class Windows extends SistemaOperativo {


    public Windows(){
        System.out.println("Se utiliza Windows");
    }

    @Override
    public void manejarProcesos() {
        int rand = new Random().nextInt(100);

        if(rand < 50) {
            esquema = new PreemtiveScheduler();
            esquema.manageProcess();
        } else {
            esquema = new TimeSlicedScheduler();
            esquema.manageProcess();
        }

    }
}
