package refactorizado.model;

import java.util.List;

public class Pedido {
    private final String nombreCliente;
    private final String emailCliente;
    private final List<String> nombresProductos;
    private final List<Double> preciosProductos;
    private final List<Integer> cantidades;
    private final String tipoCliente;

    public Pedido(String nombreCliente, String emailCliente, List<String> nombresProductos,
                  List<Double> preciosProductos, List<Integer> cantidades, String tipoCliente) {
        ValidadorCliente.validar(nombreCliente, emailCliente);
        this.nombreCliente = nombreCliente;
        this.emailCliente = emailCliente;
        this.nombresProductos = nombresProductos;
        this.preciosProductos = preciosProductos;
        this.cantidades = cantidades;
        this.tipoCliente = tipoCliente;
    }

    public String getNombreCliente() { return nombreCliente; }
    public String getEmailCliente() { return emailCliente; }
    public List<String> getNombresProductos() { return nombresProductos; }
    public List<Double> getPreciosProductos() { return preciosProductos; }
    public List<Integer> getCantidades() { return cantidades; }
    public String getTipoCliente() { return tipoCliente; }

    public double calcularSubtotal() {
        double subtotal = 0;
        for (int i = 0; i < nombresProductos.size(); i++) {
            subtotal += preciosProductos.get(i) * cantidades.get(i);
        }
        return subtotal;
    }
}
