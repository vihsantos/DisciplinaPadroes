public class CursoFactory extends ProdutoFactory {
    public CursoFactory(String nome, String codigo) {
        super(nome,codigo);
    }
    
    public CursoFactory() {
        super();
    }

    @Override
    public ProdutoInterface criarProduto() {
        return new Curso(this.nome, this.codigo);
    }
}
