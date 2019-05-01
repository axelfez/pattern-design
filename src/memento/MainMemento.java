package Caso1_Memento;

import java.util.Scanner;

public class MainMemento {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        boolean seguir = true;
        Scanner reader = new Scanner(System.in);

        while (seguir) {
            System.out.println("Opciones:");
            System.out.print("1. Calcular" + '\n' + "2. Deshacer" + '\n' + "3. Guardar la información actual" + '\n' + "4. Restaurar" + '\n' + "5. Borrar todo" + '\n' + "6. Cerrar "  );
            int n = reader.nextInt();
            if(n == 1){
                System.out.print("Cual variable? (x, y, z) ");
                String variable = reader.next();
                System.out.print("Que desea sumar? ");
                String sumando = reader.next();
                if(variable.equals("x")){
                    if(sumando.equals("x")){
                        calculadora.addToX(calculadora.getX());
                    }else if(sumando.equals("y")){
                        calculadora.addToX(calculadora.getY());
                    }else if(sumando.equals("z")) {
                        calculadora.addToX(calculadora.getZ());
                    }else {
                        calculadora.addToX(Integer.parseInt(sumando));
                    }
                }else if(variable.equals("y")){
                    if(sumando.equals("x")){
                        calculadora.addToY(calculadora.getX());
                    }else if(sumando.equals("y")){
                        calculadora.addToY(calculadora.getY());
                    }else if(sumando.equals("z")) {
                        calculadora.addToY(calculadora.getZ());
                    }else {
                        calculadora.addToY(Integer.parseInt(sumando));
                    }
                }else {
                    if(sumando.equals("x")){
                        calculadora.addToZ(calculadora.getX());
                    }else if(sumando.equals("y")){
                        calculadora.addToZ(calculadora.getY());
                    }else if(sumando.equals("z")) {
                        calculadora.addToZ(calculadora.getZ());
                    }else {
                        calculadora.addToZ(Integer.parseInt(sumando));
                    }
                }

            }else if (n == 2) {
                calculadora.undo();
            }else if(n==3){
                calculadora.save();
            }else if(n == 4){
                System.out.print("¿Cual numero de version desea Restaurar? ");
                int index = reader.nextInt();
                calculadora.restore(index);
            }else if(n==5){
                calculadora.restore();
            } else{
                seguir= false;
            }
            System.out.println(calculadora.toString());

        }
        reader.close();
    }
}
