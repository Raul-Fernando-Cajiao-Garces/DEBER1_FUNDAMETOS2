package refactorizado.interfaces;

public interface IPedidoRepository {
    void guardarPedido(String cliente, double total);
    void eliminarPedido(int idPedido);
}
