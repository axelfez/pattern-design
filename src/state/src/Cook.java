public class Cook implements State {
    private Robot robot;

    public Cook(Robot robot){ this.robot = robot; }

    @Override
    public void on() { System.out.println("El robot está encendido."); }

    @Override
    public void walk() { System.out.println("El robot está caminando."); }

    @Override
    public void cook() { System.out.println("El robot está cocinando."); }

    @Override
    public void off() { System.out.println("El robot no se puede apagar mientras cocina."); }
}