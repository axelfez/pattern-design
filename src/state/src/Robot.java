public class Robot {

    private State on;
    private State cook;
    private State off;
    private State walk;

    private State state;

    Robot(){
        this.on = new On(this);
        this.cook = new Cook(this);
        this.off = new Off(this);
        this.walk = new Walk(this);

        this.state = on;
    }

    void setRoboticState(State state){ this.state = state; }

    void walk() { state.walk(); }

    void cook() { state.cook(); }

    void off() { state.off(); }

    void on(){ state.on(); }

    State getOn() { return on; }

    State getCook() { return cook; }

    State getOff() { return off; }

    void setState(State state) { this.state = state; }

}