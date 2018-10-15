package Caso4_Adapter;

public class AdapterMain {



    public static void main(String[] args) {
        SistemaOperativo so = new SistemaOperativo();

        so.useNewThreadScheduler();
        so.usePreemptiveThreadScheduler();
        so.useNewThreadScheduler();
    }
}
