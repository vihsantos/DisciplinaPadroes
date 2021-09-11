public class QuadradoFactory extends FiguraFactory{
    public QuadradoFactory(){
        super();
    }
    
    public FiguraInterface criarFigura(){
        return new Quadrado();
    }
}
