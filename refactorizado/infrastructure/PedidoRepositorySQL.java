package refactorizado.infrastructure;

import refactorizado.interfaces.IPedidoRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PedidoRepositorySQL implements IPedidoRepository {
    private final Connection conexionBD;

    public PedidoRepositorySQL(Connection conexionBD) {
        this.conexionBD = conexionBD;
    }

    @Override
    public void guardarPedido(String cliente, double total) {
        String sql = "INSERT INTO pedidos (cliente, total) VALUES (?, ?)";
        try (PreparedStatement stmt = conexionBD.prepareStatement(sql)) {
            stmt.setString(1, cliente);
            stmt.setDouble(2, total);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al guardar el pedido: " + e.getMessage());
        }
    }

    @Override
    public void eliminarPedido(int idPedido) {
        String sql = "DELETE FROM pedidos WHERE id = ?";
        try (PreparedStatement stmt = conexionBD.prepareStatement(sql)) {
            stmt.setInt(1, idPedido);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al cancelar el pedido: " + e.getMessage());
        }
    }
}
