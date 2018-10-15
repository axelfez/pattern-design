package Caso4_Bridge;

public class PreemtiveScheduler implements IEsquema {


    @Override
    public void manageProcess() {
        System.out.println("Se utiliza el Preemtive Thread Scheduler");
    }
}
