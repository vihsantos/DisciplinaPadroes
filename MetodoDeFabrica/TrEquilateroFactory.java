public class TrEquilateroFactory extends FiguraFactory{
    public TrEquilateroFactory(){
        super();
    }
    
    public FiguraInterface criarFigura(){
        return new TrEquilatero();
    }
}
