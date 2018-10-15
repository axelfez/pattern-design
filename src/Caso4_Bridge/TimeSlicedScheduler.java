package Caso4_Bridge;

public class TimeSlicedScheduler implements IEsquema {


    @Override
    public void manageProcess() {
        System.out.println("Se utiliza el TimeSliced Thread Scheduler");
    }
}
