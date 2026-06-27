package refactorizado;

import refactorizado.interfaces.*;
import refactorizado.model.*;

public class GestorPedidos {
    private final IPedidoRepository repository;
    private final IFacturador facturador;
    private final INotificador notificador;

    public GestorPedidos(IPedidoRepository repository, IFacturador facturador, INotificador notificador) {
        this.repository = repository;
        this.facturador = facturador;
        this.notificador = notificador;
    }

    public void procesarPedido(Pedido pedido) {
        DetallePrecios precios = CalculadoraPrecios.calcular(pedido);
        repository.guardarPedido(pedido.getNombreCliente(), precios.total);
        facturador.generarFactura(pedido, precios);
        notificador.enviarConfirmacion(pedido.getNombreCliente(), pedido.getEmailCliente(), precios.total);
    }

    public void cancelarPedido(String nombreCliente, String emailCliente, int idPedido) {
        ValidadorCliente.validar(nombreCliente, emailCliente);
        repository.eliminarPedido(idPedido);
        notificador.enviarCancelacion(nombreCliente, emailCliente, idPedido);
    }
}
