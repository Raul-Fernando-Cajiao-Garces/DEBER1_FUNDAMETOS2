package refactorizado.model;

public class DetallePrecios {
    public final double subtotal;
    public final double descuento;
    public final double impuesto;
    public final double total;

    public DetallePrecios(double subtotal, double descuento, double impuesto, double total) {
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.impuesto = impuesto;
        this.total = total;
    }
}
