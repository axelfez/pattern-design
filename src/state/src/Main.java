public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.on();
        robot.walk();
        robot.cook();
        robot.off();

        robot.walk();
        robot.off();

        robot.cook();
        robot.on();
    }

}
