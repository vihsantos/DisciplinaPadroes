public class Livro implements ProdutoInterface{
    String codigo; 
    String nome;
    String isbn;
    double preco;

    public Livro(String codigo, String nome, String isbn, double preco){
        this.setCodigo(codigo);
        this.setIsbn(isbn);
        this.setNome(nome);
        this.setPreco(preco);
    }
    
    public Livro() {
    }

    public Livro(String nome2, String codigo2) {
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
