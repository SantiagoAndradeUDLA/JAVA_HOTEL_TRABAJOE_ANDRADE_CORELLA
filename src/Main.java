public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel Central", 5);

        System.out.println("Estado inicial de las habitaciones:");
        hotel.mostrarEstadoHabitaciones();

        System.out.println("\nCreando reservas...");
        hotel.crearReserva("Santiago Andrade", "2025-05-26", "2025-05-28");
        hotel.crearReserva("Jose Corella", "2025-05-27", "2025-05-30");

        System.out.println("\nReservas realizadas:");
        hotel.mostrarReservas();

        System.out.println("\nEstado final de las habitaciones:");
        hotel.mostrarEstadoHabitaciones();
    }
}
