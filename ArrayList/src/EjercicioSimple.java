import java.util.LinkedList;
import java.util.Scanner;

public class EjercicioSimple {
    public static void main() {
        LinkedList<Integer> turnos = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int turno = 1;  // Inicia el primer turno

        while (true) {
            System.out.println("\n===== Sistema de Turnos de la Carnicería =====");
            System.out.println("Turno actual: " + turno);
            System.out.println("1. Agregar un nuevo cliente (turno #" + turno + ")");
            System.out.println("2. Atender siguiente cliente");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            if (opcion == 1) {
                turnos.add(turno);
                System.out.println("Nuevo cliente agregado con el turno #" + turno);
                turno++;
            } else if (opcion == 2) {
                if (!turnos.isEmpty()) {
                    int clienteAtendido = turnos.poll();
                    System.out.println("Atendiendo al cliente con el turno #" + clienteAtendido);
                } else {
                    System.out.println("No hay clientes en espera.");
                }
            } else if (opcion == 3) {
                System.out.println("Saliendo del sistema...");
                break;
            } else {
                System.out.println("Opción inválida. Por favor, elija una opción válida.");
            }
        }
    }
}
