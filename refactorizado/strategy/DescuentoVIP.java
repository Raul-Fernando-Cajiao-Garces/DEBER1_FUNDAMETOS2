package refactorizado.strategy;

import refactorizado.interfaces.IDescuentoStrategy;

public class DescuentoVIP implements IDescuentoStrategy {
    @Override
    public double calcularDescuento(double subtotal) {
        return subtotal * 0.20;
    }
}
