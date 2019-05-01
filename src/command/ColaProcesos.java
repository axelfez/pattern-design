package Caso2_Command;


public class ColaProcesos {
    private IProceso[] procesos;
    private int size;

    ColaProcesos(int length){
        procesos = new IProceso[length];
        size = 0;
    }

    public void addProceso(IProceso proceso){
        if(size < procesos.length){
            procesos[size] = proceso;
            size++;
        }
    }

    public void ejecutarProcesos(){
        for(int i = 0; i < size; i++){
            procesos[i].ejecutar();
        }
    }
}
