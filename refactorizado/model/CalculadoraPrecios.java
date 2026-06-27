package refactorizado.model;

import refactorizado.strategy.DescuentoFactory;

public class CalculadoraPrecios {
    private static final double IVA_RATE = 0.12;

    public static DetallePrecios calcular(Pedido pedido) {
        double subtotal = pedido.calcularSubtotal();
        double descuento = DescuentoFactory.obtenerEstrategia(pedido.getTipoCliente())
                                           .calcularDescuento(subtotal);
        double impuesto = (subtotal - descuento) * IVA_RATE;
        double total = subtotal - descuento + impuesto;
        return new DetallePrecios(subtotal, descuento, impuesto, total);
    }
}
