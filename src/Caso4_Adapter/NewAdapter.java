package Caso4_Adapter;

public class NewAdapter implements IEsquema{
    private NewScheduler scheduler = new NewScheduler();


    @Override
    public void manageProcess() {
        scheduler.commandOperations();
    }
}
