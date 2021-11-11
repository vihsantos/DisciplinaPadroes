package Factory;

public class DisciplinaFactory extends ProdutoFactory{
    public DisciplinaFactory(String codigo, String nome) {
		super();
	}
	
	public DisciplinaFactory() {
		super();
	}	

	public ProdutoInterface criarProduto() {
		return new Disciplina(this.codigo, this.nome);
	}
}
