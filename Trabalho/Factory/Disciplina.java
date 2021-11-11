package Factory;

public class Disciplina implements ProdutoInterface{
    String nome;
    String codigo;
    double preco;
    int chTotal;
    double pctCumprido;
    
    public Disciplina(String codigo, String nome) {
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