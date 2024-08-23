package Ej2;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private Cliente cliente;
    private Funcion funcion;
    private List<Asiento> listaAsientos;


    //constructor

    public Reserva(Cliente cliente, Funcion funcion){
        this.cliente = cliente;
        this.funcion = funcion;
        listaAsientos = new ArrayList<>();
    }

    //metodos

    public void agregarAsientos(Asiento asiento){
        listaAsientos.add(asiento);
    }

    public Cliente obtenerCliente(){

        return cliente;
    }

    public Funcion obtenerFuncion(){

        return funcion;
    }

    public List<Asiento> obtenerListaAsientos(){
        return listaAsientos;
    }
}
