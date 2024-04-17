import java.util.*;

class TransaccionVenta {
    private String producto;
    private double precio;
    private int cantidad;
    private double total;

    public TransaccionVenta(String producto, double precio, int cantidad) {
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.total = precio * cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Producto: " + producto + ", Precio: " + precio + ", Cantidad: " + cantidad + ", Total: " + total;
    }
}

public class Main {

    public static void main(String[] args) {

        TreeSet<String> nombres = new TreeSet<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Ana");

        System.out.println("Nombres ordenados:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }


        List<TransaccionVenta> transacciones = new ArrayList<>();
        transacciones.add(new TransaccionVenta("Producto A", 10.5, 2));
        transacciones.add(new TransaccionVenta("Producto B", 8.75, 3));
        transacciones.add(new TransaccionVenta("Producto A", 10.5, 1));
        transacciones.add(new TransaccionVenta("Producto C", 15.25, 5));


        String productoBuscado = "Producto A";
        List<TransaccionVenta> transaccionesProductoX = new ArrayList<>();
        for (TransaccionVenta transaccion : transacciones) {
            if (transaccion.getProducto().equals(productoBuscado)) {
                transaccionesProductoX.add(transaccion);
            }
        }


        System.out.println("\nTransacciones del producto " + productoBuscado + ":");
        for (TransaccionVenta transaccion : transaccionesProductoX) {
            System.out.println(transaccion);
        }

        Collections.sort(transacciones, Comparator.comparingDouble(TransaccionVenta::getTotal).reversed());


        System.out.println("\nTransacciones ordenadas por total (de mayor a menor):");
        for (TransaccionVenta transaccion : transacciones) {
            System.out.println(transaccion);
        }
    }
}
