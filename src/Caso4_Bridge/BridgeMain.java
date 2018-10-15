package Caso4_Bridge;

public class BridgeMain {

    public static void main(String[] args) {
        SistemaOperativo so = new Windows();

        so.manejarProcesos();
        so.manejarProcesos();
        so.manejarProcesos();

        so = new Linux();
        so.manejarProcesos();
        so.manejarProcesos();
        so.manejarProcesos();

    }
}
