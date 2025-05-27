import java.util.ArrayList;

public class Hotel {
    private String nombre;
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Reserva> reservas;

    public Hotel(String nombre, int cantidadHabitaciones) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();
        this.reservas = new ArrayList<>();

        for (int i = 1; i <= cantidadHabitaciones; i++) {
            habitaciones.add(new Habitacion(i));
        }
    }

    public Habitacion buscarHabitacionDisponible() {
        for (Habitacion h : habitaciones) {
            if (h.estaDisponible()) {
                return h;
            }
        }
        return null;
    }

    public boolean crearReserva(String nombreCliente, String fechaEntrada, String fechaSalida) {
        Habitacion disponible = buscarHabitacionDisponible();
        if (disponible != null) {
            Reserva nueva = new Reserva(nombreCliente, disponible, fechaEntrada, fechaSalida);
            reservas.add(nueva);
            return true;
        }
        return false;
    }

    public void mostrarReservas() {
        for (Reserva r : reservas) {
            System.out.println(r);
        }
    }

    public void mostrarEstadoHabitaciones() {
        for (Habitacion h : habitaciones) {
            System.out.println(h);
        }
    }
}
