package Factory;

public class Livro implements ProdutoInterface {
    String nome;
    String codigo;
    double preco;
    String isbn;
    
    public Livro(String codigo, String nome) {
        this.setNome(nome);
        this.setCodigo(codigo);
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
