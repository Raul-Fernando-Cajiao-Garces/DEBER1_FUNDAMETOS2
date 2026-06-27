package refactorizado.interfaces;

import refactorizado.model.Pedido;
import refactorizado.model.DetallePrecios;

public interface IFacturador {
    void generarFactura(Pedido pedido, DetallePrecios precios);
}
