package refactorizado.infrastructure;

import refactorizado.interfaces.IFacturador;
import refactorizado.model.Pedido;
import refactorizado.model.DetallePrecios;
import java.io.FileWriter;
import java.io.IOException;

public class FacturadorTexto implements IFacturador {
    @Override
    public void generarFactura(Pedido pedido, DetallePrecios precios) {
        try (FileWriter writer = new FileWriter("factura_" + pedido.getNombreCliente() + ".txt")) {
            writer.write("FACTURA\n");
            writer.write("Cliente: " + pedido.getNombreCliente() + "\n");
            for (int i = 0; i < pedido.getNombresProductos().size(); i++) {
                writer.write(pedido.getNombresProductos().get(i) + " x" + pedido.getCantidades().get(i)
                    + " = $" + (pedido.getPreciosProductos().get(i) * pedido.getCantidades().get(i)) + "\n");
            }
            writer.write("Subtotal: $" + precios.subtotal + "\n");
            writer.write("Descuento: $" + precios.descuento + "\n");
            writer.write("Impuesto: $" + precios.impuesto + "\n");
            writer.write("TOTAL: $" + precios.total + "\n");
        } catch (IOException e) {
            System.out.println("Error al generar la factura: " + e.getMessage());
        }
    }
}
