public class Walk implements State {
    private Robot robot;

    public Walk(Robot robot){ this.robot = robot; }

    @Override
    public void on() {
        robot.setState(robot.getOn());
        System.out.println("El robot está encendido.");
    }

    @Override
    public void walk() {
        robot.setState(robot.getOn());
        System.out.println("El robot está caminando.");
    }

    @Override
    public void cook() {
        robot.setRoboticState(robot.getCook());
        System.out.println("El robot está cocinando.");
    }

    @Override
    public void off() {
        robot.setState(robot.getOff());
        System.out.println("El robot se apagó.");

    }

}