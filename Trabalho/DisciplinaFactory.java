public class DisciplinaFactory extends ProdutoFactory{

    public DisciplinaFactory(String nome, String codigo) {
        super(nome,codigo);
    }

    @Override
    public ProdutoInterface criarProduto() {
        return new Disciplina(this.nome, this.codigo);
    }
     
}
