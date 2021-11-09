public abstract class ProdutoFactory {
    
    protected String codigo;
    protected String nome;

    public static ProdutoFactory getFactory (TipoProduto tipo){
        
        if(tipo.name().equals("Livro")) return new LivroFactory();
        else if(tipo.name().equals("Disciplina")) return new DisciplinaFactory();
        else if (tipo.name().equals("Curso")) return new CursoFactory();
        
        return null;
    }

    public ProdutoFactory(String codigo, String nome){
        this.codigo=codigo;
        this.nome=nome;
    }

    public ProdutoFactory() {
    }

    public abstract ProdutoInterface criarProduto();

    public ProdutoInterface getProduto(){
        ProdutoInterface produto = this.criarProduto();
        return produto;
    }
}
