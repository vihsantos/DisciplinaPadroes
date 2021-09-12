import java.util.HashMap;
import java.util.Map;

public abstract class FiguraFactory {
    
    public static FiguraFactory factory(String nome) {
        FiguraFactory figura;
        Map<String , FiguraFactory> figuras = new HashMap<>();
        figuras.put("Circulo", new CirculoFactory());
        figuras.put("Quadrado", new QuadradoFactory());
        figuras.put("Triangulo", new TrEquilateroFactory());

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

    public void sequencia(){
        //
    }
}
