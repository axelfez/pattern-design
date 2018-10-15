package Caso4_Adapter;

public class SistemaOperativo {
    private IEsquema esquema;

    public void usePreemptiveThreadScheduler(){
        esquema = new Preemtive();
        esquema.manageProcess();

    }

    public void useTimeSlicedThreadScheduler(){
        esquema = new TimeSliced();
        esquema.manageProcess();
    }

    public void useNewThreadScheduler(){
        esquema = new NewAdapter();
        esquema.manageProcess();
    }
}
