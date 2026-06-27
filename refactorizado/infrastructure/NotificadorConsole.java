package refactorizado.infrastructure;

import refactorizado.interfaces.INotificador;

public class NotificadorConsole implements INotificador {
    @Override
    public void enviarConfirmacion(String nombreCliente, String emailCliente, double total) {
        System.out.println("Enviando correo a " + emailCliente + "...");
        System.out.println("Asunto: Confirmacion de pedido");
        System.out.println("Cuerpo: Estimado " + nombreCliente + ", su pedido por $"
            + total + " ha sido procesado.");
        System.out.println("[LOG] Pedido procesado para " + nombreCliente + " - Total: " + total);
    }

    @Override
    public void enviarCancelacion(String nombreCliente, String emailCliente, int idPedido) {
        System.out.println("Enviando correo a " + emailCliente + "...");
        System.out.println("Asunto: Cancelacion de pedido");
        System.out.println("Cuerpo: Estimado " + nombreCliente + ", su pedido #"
            + idPedido + " ha sido cancelado.");
    }
}
