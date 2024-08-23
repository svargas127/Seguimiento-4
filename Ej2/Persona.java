package Ej2;

public class Persona {
    private String Cliente;
    private String nombre;
    private int indentificacion;
    private int direccion;

    public Persona(String nombre, String identificacion, String direccion) {
    }

    //metodos

    public String obtenerNombre(){
        return nombre;
    }

    public int obtenerIdenficacion(){
        return indentificacion;
    }

    public int obtenerDireccion(){
        return direccion;
    }

    public Persona(int indentificacion, String nombre, String cliente, int direccion) {
        this.indentificacion = indentificacion;
        this.nombre = nombre;
        Cliente = cliente;
        this.direccion = direccion;
    }
}


