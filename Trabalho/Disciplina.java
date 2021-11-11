public class Disciplina implements ProdutoInterface{
    String nome;
    String codigo;
    double preco;
    int chTotal;
    double pctCumprido;
    
    public Disciplina(String codigo, String nome) {
        this.nome=nome;
        this.codigo=codigo;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void set(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
}