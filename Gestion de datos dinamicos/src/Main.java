import java.util.*;

class InterfazUsuario {
    private Map<Integer, Integer> datos = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void agregarPareja(int primero, int segundo) {
        datos.put(primero, segundo);
        System.out.println("Pareja (" + primero + ", " + segundo + ") agregada.");
    }

    public void mostrarDatos() {
        if (datos.isEmpty()) {
            System.out.println("No hay parejas para mostrar.");
        } else {
            System.out.println("Parejas:");
            for (Map.Entry<Integer, Integer> entry : datos.entrySet()) {
                System.out.println("(" + entry.getKey() + ", " + entry.getValue() + ")");
            }
        }
    }

    public void modificarPareja(int primero, int nuevoSegundo) {
        if (datos.containsKey(primero)) {
            datos.put(primero, nuevoSegundo);
            System.out.println("Pareja con primer valor " + primero + " modificado con nuevo segundo valor: " + nuevoSegundo);
        } else {
            System.out.println("No existe una pareja con el primer valor especificado.");
        }
    }

    public void eliminarPareja(int primero) {
        if (datos.containsKey(primero)) {
            datos.remove(primero);
            System.out.println("Pareja con primer valor " + primero + " eliminada.");
        } else {
            System.out.println("No existe una pareja con el primer valor especificado.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        InterfazUsuario interfaz = new InterfazUsuario();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar pareja");
            System.out.println("2. Mostrar datos");
            System.out.println("3. Modificar pareja");
            System.out.println("4. Eliminar pareja");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            String input = scanner.next();

            if (!input.matches("\\d+")) {
                System.out.println("Por favor, introduce un número válido.");
                continue;
            }

            int opcion = Integer.parseInt(input);

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el primer número: ");
                    int primero = scanner.nextInt();
                    System.out.print("Introduce el segundo número: ");
                    int segundo = scanner.nextInt();
                    interfaz.agregarPareja(primero, segundo);
                    break;
                case 2:
                    interfaz.mostrarDatos();
                    break;
                case 3:
                    System.out.print("Introduce el primer número de la pareja a modificar: ");
                    int paraModificar = scanner.nextInt();
                    System.out.print("Introduce el nuevo segundo número: ");
                    int nuevoSegundo = scanner.nextInt();
                    interfaz.modificarPareja(paraModificar, nuevoSegundo);
                    break;
                case 4:
                    System.out.print("Introduce el primer número de la pareja a eliminar: ");
                    int paraEliminar = scanner.nextInt();
                    interfaz.eliminarPareja(paraEliminar);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}
