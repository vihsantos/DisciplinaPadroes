public class CursoFactory extends ProdutoFactory {
    public CursoFactory() {
        super();
    }

    @Override
    public ProdutoInterface criarProduto() {
        return new Curso();
    }
}
