public abstract class ProdutoFactory {
    String nome;
    String codigo;

    public ProdutoFactory(String nome, String codigo){
        this.nome=nome;
        this.codigo=codigo;
    }

    public ProdutoFactory getFactory(TipoProduto tipo, String nome, String codigo){
        
        if(tipo.name().equals("Livro")) return new LivroFactory(nome, codigo);
        else if (tipo.name().equals("Disciplina")) return new DisciplinaFactory(nome, codigo);
        else
        return null;
    }

    public ProdutoFactory(){}

    public abstract ProdutoInterface criarProduto();

	
	public ProdutoInterface getProduto() {
		ProdutoInterface produto = this.criarProduto();
		return produto;
	}
}
