package Ej2;

import java.util.ArrayList;
import java.util.List;

class Cliente extends Persona {
    private List <Reserva> historialReservas;

    public Cliente(String nombre, String identificacion, String direccion) {
        super(nombre, identificacion, direccion);
        historialReservas = new ArrayList<>();
    }

    public void agregarReserva(Reserva reserva) {
        historialReservas.add(reserva);
    }

    public List<Reserva> obtenerHistorialReservas() {
        return historialReservas;
    }
}
