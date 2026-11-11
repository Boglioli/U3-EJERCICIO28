public class ProductoAlimenticio extends Producto {
    double procentajeImpuesto;
    public ProductoAlimenticio(String codigo, String descripcion, double costoBase, double procentajeImpuesto) {
        super(codigo, descripcion, costoBase);
        this.procentajeImpuesto = procentajeImpuesto;
    }
    @Override
    public double calcularPrecioFinal() {
        return costoBase + (costoBase * procentajeImpuesto / 100);
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("porcentaje de impuesto: " + procentajeImpuesto + "%");
        System.out.println("precio final: $" + calcularPrecioFinal());
    }
}
