public class Electrodomestico extends Producto {
    int garantiaMeses;
    double procentajeIVA;

    public Electrodomestico(String codigo, String descripcion, double costoBase, int garantiaMeses, double procentajeIVA) {
        super(codigo, descripcion, costoBase);
        this.garantiaMeses = garantiaMeses;
        this.procentajeIVA = procentajeIVA;
    }
@Override
    public double calcularPrecioFinal() {
        return costoBase + (costoBase * procentajeIVA / 100);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("garantía: " + garantiaMeses + " meses");
        System.out.println("porcentaje de IVA: " + procentajeIVA + "%");
        System.out.println("precio final: $" + calcularPrecioFinal());
    }
}
