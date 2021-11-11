public class Cliente {
    public static void main(String[] args) throws NullPointerException{
        ProdutoFactory factory;
        factory = ProdutoFactory.getFactory(TipoProduto.Livro);

        ProdutoInterface produto = factory.getProduto("Qualquer", "0101");

        System.out.println(produto);
    }
}
