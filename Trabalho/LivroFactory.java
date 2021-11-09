public class LivroFactory extends ProdutoFactory{

    public LivroFactory(String nome, String codigo) {
        super(nome,codigo);
    }

    public LivroFactory() {
        super();
    }

    @Override
    public ProdutoInterface criarProduto() {
        return new Livro(this.nome, this.codigo);
    }
    
}
