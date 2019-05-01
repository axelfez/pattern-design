public class Off implements State {
    private Robot robot;

    public Off(Robot robot){ this.robot = robot; }

    @Override
    public void on() { System.out.println("El robot se encendió."); }

    @Override
    public void walk() { System.out.println("El robot está caminando."); }

    @Override
    public void cook() { System.out.println("El robot no puede cocinar cuando está apagado."); }

    @Override
    public void off() { System.out.println("El robot se encuentra apagado."); }
}