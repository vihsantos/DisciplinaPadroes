public class CursoFactory extends ProdutoFactory{
    public CursoFactory(String codigo, String nome) {
		super();
	}
	
	public CursoFactory() {
		super();
	}	

	public ProdutoInterface criarProduto() {
		return new Curso(this.codigo, this.nome);
	}
}
