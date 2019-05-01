package Caso1_Memento;

public class Calculadora {
    private Memento last = null;
    private Savepoint savepoints = new Savepoint();
    private float x = 0;
    private float y = 0;
    private float z = 0;


    public float getX() {
        return x;
    }

    public float addToX(float sum){
        setLast(new Memento(x, y, z, getLast()));
        setX(getX() + sum);

        return x;
    }

    public float addToY(float sum){
        setLast(new Memento(x, y, z, getLast()));
        setY(getY() + sum);

        return y;
    }

    public float addToZ(float sum){
        setLast(new Memento(x, y, z, getLast()));
        setZ(getZ() + sum);

        return z;
    }

    public void restore(int index){
        Memento memento = savepoints.recuperarSavePoint(index);
        this.x = memento.getX();
        this.y = memento.getY();
        this.z = memento.getZ();
        setLast(new Memento(x, y, z, getLast()));
    }

    public void restore(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.setLast(null);
    }

    public void undo(){
        if(getLast() != null){
            x = getLast().getX();
            y = getLast().getY();
            z = getLast().getZ();
            setLast(getLast().getLast());
        }
    }

    private void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    private void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    private void setZ(float z) {
        this.z = z;
    }

    public Memento getLast() {
        return last;
    }

    public void setLast(Memento last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "X= " + x + "\n" + "Y= " + y + "\n" + "Z= "+ z;
    }

    public void save(){
        savepoints.agregarSavePoint(new Memento(x, y, z, last));
    }

}
