public class Reserva {
    private String nombreCliente;
    private Habitacion habitacion;
    private String fechaEntrada;
    private String fechaSalida;

    public Reserva(String nombreCliente, Habitacion habitacion, String fechaEntrada, String fechaSalida) {
        this.nombreCliente = nombreCliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        habitacion.reservar();
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    @Override
    public String toString() {
        return "Reserva de " + nombreCliente + " en la habitacion " + habitacion.getNumero() +
                " desde " + fechaEntrada + " hasta " + fechaSalida;
    }
}
