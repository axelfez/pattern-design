package Caso4_Adapter;

public class Preemtive implements IEsquema {

    @Override
    public void manageProcess() {
        System.out.println("Attending process using the Preemtive Thread Scheduler");
    }
}
