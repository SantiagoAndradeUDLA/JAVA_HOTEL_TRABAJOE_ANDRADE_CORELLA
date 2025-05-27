
/*public class Main {
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
*/

//Version datos de Usuario

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel("Hotel Central", 5);

        System.out.println("Bienvenido al sistema de reservas del hotel.");
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Crear una reserva");
            System.out.println("2. Ver reservas");
            System.out.println("3. Ver estado de habitaciones");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Fecha de entrada (YYYY-MM-DD): ");
                    String entrada = scanner.nextLine();
                    System.out.print("Fecha de salida (YYYY-MM-DD): ");
                    String salida = scanner.nextLine();

                    boolean exito = hotel.crearReserva(nombre, entrada, salida);
                    if (exito) {
                        System.out.println("Reserva creada con exito.");
                    } else {
                        System.out.println("No hay habitaciones disponibles.");
                    }
                    break;

                case 2:
                    System.out.println("Reservas registradas:");
                    hotel.mostrarReservas();
                    break;

                case 3:
                    System.out.println("Estado actual de las habitaciones:");
                    hotel.mostrarEstadoHabitaciones();
                    break;

                case 4:
                    continuar = false;
                    System.out.println("Gracias por usar el sistema de reservas.");
                    break;

                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
}
