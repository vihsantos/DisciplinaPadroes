public class Disciplina implements ProdutoInterface{
    String codigo; 
    String nome;
    double preco;
    int chTotal;
    double pctCumprido;

    public Disciplina(String codigo, String nome, double preco, int chTotal, double pctCumprido){
        this.setNome(nome);
        this.setCodigo(codigo);
        this.setPreco(preco);
        this.setPctCumprido(pctCumprido);
        this.setChTotal(chTotal);
    }

    public Disciplina() {
    }

    public Disciplina(String nome2, String codigo2) {
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setChTotal(int chTotal) {
        this.chTotal = chTotal;
    }

    public void setPctCumprido(double pctCumprido) {
        this.pctCumprido = pctCumprido;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
