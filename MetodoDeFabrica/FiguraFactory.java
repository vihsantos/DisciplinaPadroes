import java.util.HashMap;
import java.util.Map;

public abstract class FiguraFactory {
    
    public static Map<String , FiguraFactory> hashmap(){
        Map<String , FiguraFactory> figuras = new HashMap<>();
        figuras.put("Circulo", new CirculoFactory());
        figuras.put("Quadrado", new QuadradoFactory());
        figuras.put("Triangulo", new TrEquilateroFactory());
        return figuras;
    }
    public static FiguraFactory factory(String nome) {
        Map<String , FiguraFactory> figuras = hashmap();
        FiguraFactory figura;
        if (figuras.containsKey(nome)){
            figura= figuras.get(nome);
            return figura;
        }
        return null;
    }

    public abstract FiguraInterface criarFigura();

    public FiguraInterface pegarFigura(){
        FiguraInterface figura = this.criarFigura();
        return figura;
    }

}
