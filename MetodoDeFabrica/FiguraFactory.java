import java.util.HashMap;
import java.util.Map;

public abstract class FiguraFactory {
    
    public static FiguraFactory factory(String nome) {
        FiguraFactory figura;
        Map<String , FiguraFactory> figuras = new HashMap<>();
        figuras.put("Circulo", new CirculoFactory());
        figuras.put("Quadrado", new QuadradoFactory());
        figuras.put("Triangulo", new TrEquilateroFactory());

        for (Map.Entry<String , FiguraFactory> entry : figuras.entrySet()) {
            figura= entry.getValue();
            return figura;
        }

        return null;
    }

    
}
