public class Producto {
    protected String codigo;
    protected String descripcion;
    protected double costoBase;
    public Producto(String codigo, String descripcion, double costoBase) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.costoBase = costoBase;
    }
    public double calcularPrecioFinal() {
        return costoBase;

    }
    public void mostrarInformacion() {
        System.out.println("codigo: " + codigo);
        System.out.println("descripción: " + descripcion);
        System.out.println("costo base: $" + costoBase);
    }
}
