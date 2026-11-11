public class Main {
    public static void main(String[] args) {
        Producto[] productos = new Producto[2];
        productos[0] = new ProductoAlimenticio("PA001", "leche", 10, 10);
        productos[1] = new Electrodomestico("ED001", "refrigerador", 500, 12, 19);
        for (int i = 0; i < productos.length; i++) {
           System.out.println("--- producto ---");
           productos[i].mostrarInformacion();
        }
    }
}
