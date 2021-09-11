public class CirculoFactory extends FiguraFactory {
    public CirculoFactory(){
        super();
    }
    
    public FiguraInterface criarFigura(){
        return new Circulo();
    }
}
