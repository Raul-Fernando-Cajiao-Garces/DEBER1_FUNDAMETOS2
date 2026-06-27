package refactorizado.model;

public class ValidadorCliente {
    public static void validar(String nombreCliente, String emailCliente) {
        if (nombreCliente == null || nombreCliente.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: nombre de cliente invalido");
        }
        if (emailCliente == null || !emailCliente.contains("@")) {
            throw new IllegalArgumentException("Error: email invalido");
        }
    }
}
