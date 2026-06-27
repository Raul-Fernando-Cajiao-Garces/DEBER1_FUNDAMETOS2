package refactorizado.strategy;

import refactorizado.interfaces.IDescuentoStrategy;

public class DescuentoRegular implements IDescuentoStrategy {
    @Override
    public double calcularDescuento(double subtotal) {
        return subtotal * 0.05;
    }
}
