package Caso1_Memento;

public class Memento {
    private Memento last;
    private float x;
    private float y;
    private float z;

    Memento(float x, float y, float z, Memento last){
        this.x = x;
        this.y = y;
        this.z = z;
        this.last = last;
    }

    public Memento getLast() {
        return last;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }
}
