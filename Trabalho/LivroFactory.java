public class LivroFactory extends ProdutoFactory{

    public LivroFactory() {
        super();
    }

    @Override
    public ProdutoInterface criarProduto() {
        return new Livro();
    }
    
}
