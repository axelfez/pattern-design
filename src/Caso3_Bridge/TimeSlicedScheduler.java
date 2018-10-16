package Caso3_Bridge;

public class TimeSlicedScheduler implements IEsquema {


    @Override
    public void manageProcess() {
        System.out.println("Se utiliza el TimeSliced Thread Scheduler");
    }
}
