package Caso4_Adapter;

public class TimeSliced implements IEsquema{

    @Override
    public void manageProcess() {
        System.out.println("Attending process using the TimeSliced Thread Scheduler");

    }
}
