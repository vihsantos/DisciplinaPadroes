public class DisciplinaFactory extends ProdutoFactory{

    public DisciplinaFactory() {
        super();
    }

    @Override
    public ProdutoInterface criarProduto() {
        return new Disciplina();
    }
     
}
