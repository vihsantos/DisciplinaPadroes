package Factory;

public class LivroFactory extends ProdutoFactory{
    public LivroFactory(String codigo, String nome) {
		super();
	}
	
	public LivroFactory() {
		super();
	}	

	public ProdutoInterface criarProduto() {
		return new Livro(this.codigo, this.nome);
	}
}