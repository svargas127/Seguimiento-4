package Ej2;

public class Asiento {
    public int fila;
    public int columna;
    public String estado;


    //constructor

    public Asiento(int fila, int columna, String estado) {
        this.fila = fila;
        this.columna = columna;
        this.estado = "disponible";
    }

    public Asiento(int fila, int columna) {
    }


    //metodos

    public int obtenerFila(){
        return fila;
    }

    public int obtenerColumna(){
        return columna;
    }

    public String estado(){
        return estado;
    }

    public void reservar(){
        estado = "Reservado";
    }

    public void ocupar(){
        estado = "ocupado";

    }
}
