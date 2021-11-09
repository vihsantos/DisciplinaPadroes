public class Cliente {
    public static void main(String[] args) {
        
        ProdutoFactory factory=  ProdutoFactory.getFactory(TipoProduto.Livro);

        ProdutoInterface produto = factory.getProduto();

        System.out.println(produto);

    }
}
