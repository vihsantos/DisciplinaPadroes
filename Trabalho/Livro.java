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

    @Override
    public double getPreco() {
        return preco;
    }



    public String getCodigo() {
        return codigo;
    }



    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getIsbn() {
        return isbn;
    }



    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



    public void setPreco(double preco) {
        this.preco = preco;
    }
}
