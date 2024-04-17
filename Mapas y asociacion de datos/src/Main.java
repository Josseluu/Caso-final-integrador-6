import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> numerosLetras = new HashMap<>();
        numerosLetras.put(1, "A");
        numerosLetras.put(2, "B");
        numerosLetras.put(3, "C");


        int clave = 2;
        if (numerosLetras.containsKey(clave)) {
            String letra = numerosLetras.get(clave);
            System.out.println("La letra asociada al número " + clave + " es: " + letra);
        } else {
            System.out.println("No se encontró ninguna letra asociada al número " + clave);
        }


        Map<Integer, String> numerosTexto = new HashMap<>();
        numerosTexto.put(1, "uno");
        numerosTexto.put(2, "dos");
        numerosTexto.put(3, "tres");


        String criterio = "dos";
        int numeroAsociado = obtenerNumero(numerosTexto, criterio);
        if (numeroAsociado != -1) {
            System.out.println("El número asociado al texto '" + criterio + "' es: " + numeroAsociado);
        } else {
            System.out.println("No se encontró ningún número asociado al texto '" + criterio + "'");
        }
    }


    public static int obtenerNumero(Map<Integer, String> mapa, String criterio) {
        for (Map.Entry<Integer, String> entry : mapa.entrySet()) {
            if (entry.getValue().equals(criterio)) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
