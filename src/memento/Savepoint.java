package Caso1_Memento;

import java.util.ArrayList;

public class Savepoint {
    private final ArrayList<Memento> historial = new ArrayList();

    public void agregarSavePoint(Memento savepoint){
        historial.add(savepoint);
    }

    public Memento recuperarSavePoint(int index){
        return historial.get(index);
    }

}
