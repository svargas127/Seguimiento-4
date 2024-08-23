package Ej4;

import java.time.LocalDate;
import java.util.Date;

public class Main {

        public static void main(String[] args) {
            // Crear un producto perecedero
            LocalDate fechaVencimiento =  LocalDate.of(2024,8, 31);
            ProductoPerecedero leche = new ProductoPerecedero("Leche", "Leche descremada", 2.5, 50, fechaVencimiento);
            // Mostrar información del producto perecedero
            System.out.println("Producto: " + leche.obtenerNombre());
            System.out.println("Descripción: " + leche.obtenerDescripcion());
            System.out.println("Precio: $" + leche.obtenerPrecio());
            System.out.println("Stock disponible: " + leche.obtenerStock());
            System.out.println("Fecha de vencimiento: " + leche.obtenerFechaVencimiento());
        }
    }

