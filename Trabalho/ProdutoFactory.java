public abstract class ProdutoFactory {
    String nome;
    String codigo;

    public ProdutoFactory(String nome, String codigo){
        this.nome=nome;
        this.codigo=codigo;
    }

    public static ProdutoFactory getFactory(TipoProduto tipo){
        
        if(tipo.name().equals("Livro")) return new LivroFactory();
        else if (tipo.name().equals("Disciplina")) return new DisciplinaFactory();
        else
        return null;
    }

    public ProdutoFactory(){}

    public abstract ProdutoInterface criarProduto();

	
	public ProdutoInterface getProduto(String nome, String codigo) {
		ProdutoInterface produto = this.criarProduto();
		return produto;
	}
}
