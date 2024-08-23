package Ej2;

import java.util.List;

public class Funcion {
    public String pelicula;
    public float horaInicio;
    public int sala;
    public float precioEntrada;
    private List<Funcion> Pelicula;


    //constructor

    public Funcion(String pelicula, float horaInicio, int sala, float precioEntrada, List<Funcion> pelicula1) {
        this.pelicula = pelicula;
        this.horaInicio = horaInicio;
        this.sala = sala;
        this.precioEntrada = precioEntrada;
        Pelicula = pelicula1;
    }

    //Metodos
    public String obtenerPelicula() {
        return pelicula;
    }
    public float obtenerHoraInicio () {
            return horaInicio;
        }

        public int obtenerSala () {
            return sala;
        }

        public float obtenerPrecioEntrada () {
            return precioEntrada;
        }
}