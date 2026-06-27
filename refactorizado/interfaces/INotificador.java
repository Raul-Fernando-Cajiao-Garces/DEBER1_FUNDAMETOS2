package refactorizado.interfaces;

public interface INotificador {
    void enviarConfirmacion(String nombreCliente, String emailCliente, double total);
    void enviarCancelacion(String nombreCliente, String emailCliente, int idPedido);
}
