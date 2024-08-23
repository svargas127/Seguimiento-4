package Ej2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

       //Datos de persona

        String nombre = JOptionPane.showInputDialog("Escribe tu nombre: ");
        int identificacion = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero de Identificacion: "));
        int direccion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la dirección de vivienda"));
       // de la pelicula
        String pelicula = JOptionPane.showInputDialog("Escribe el nombre de la pelicula: ");
        float horaInicio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la hora de inicio de la pelicula: "));
        //Ahora va a mostrar los mensajes
        //persona
        JOptionPane.showMessageDialog(null,"Su nombre es: " + nombre);
        JOptionPane.showMessageDialog(null,"Su identificacion es: " );
        JOptionPane.showMessageDialog(null,"La direccion es: ");
        // de pelicula
        JOptionPane.showMessageDialog(null,"El nombre de la pelicula es: " + pelicula);
        JOptionPane.showMessageDialog(null,"La hora de Inicio es: " + horaInicio);

    }
}
