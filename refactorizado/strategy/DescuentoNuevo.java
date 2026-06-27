package refactorizado.strategy;

import refactorizado.interfaces.IDescuentoStrategy;

public class DescuentoNuevo implements IDescuentoStrategy {
    @Override
    public double calcularDescuento(double subtotal) {
        return 0.0;
    }
}
