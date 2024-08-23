package Ej2;


import java.util.ArrayList;
import java.util.List;

class Sala {
    private int numero;
    private int capacidad;
    private Asiento[][] listaAsientos;

    public Sala(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
        listaAsientos = new Asiento[capacidad][10];
        inicializarAsientos(); 
    }

    public int obtenerNumero() {
        return numero;
    }

    public int obtenerCapacidad() {
        return capacidad;
    }

    public Asiento obtenerAsiento(int fila, int columna) {
        if (fila >= 0 && fila < capacidad && columna >= 0 && columna < 10) {
            return listaAsientos[fila][columna];
        } else {
            System.out.println("Posición errónea.");
            return null;
        }
    }

    private void inicializarAsientos() {
        for (int fila = 0; fila < capacidad; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                listaAsientos[fila][columna] = new Asiento(fila, columna);
            }
        }
    }
}
