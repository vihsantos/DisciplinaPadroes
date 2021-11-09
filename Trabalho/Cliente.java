public class Cliente {
    public static void main(String[] args) {
        
        ProdutoFactory factory=  ProdutoFactory.getFactory(TipoProduto.Livro, "Qualquer", "0102");

        ProdutoInterface produto = factory.getProduto();
        
        System.out.println(produto);

    }
}
