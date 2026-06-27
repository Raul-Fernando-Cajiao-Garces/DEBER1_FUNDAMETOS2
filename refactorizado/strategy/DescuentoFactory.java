package refactorizado.strategy;

import refactorizado.interfaces.IDescuentoStrategy;
import java.util.HashMap;
import java.util.Map;

public class DescuentoFactory {
    private static final Map<String, IDescuentoStrategy> estrategias = new HashMap<>();

    static {
        estrategias.put("VIP", new DescuentoVIP());
        estrategias.put("FRECUENTE", new DescuentoFrecuente());
        estrategias.put("REGULAR", new DescuentoRegular());
        estrategias.put("NUEVO", new DescuentoNuevo());
    }

    public static IDescuentoStrategy obtenerEstrategia(String tipoCliente) {
        return estrategias.getOrDefault(tipoCliente, new DescuentoNuevo());
    }
}
