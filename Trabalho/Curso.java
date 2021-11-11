import java.util.List;

public class Curso implements Prototype, ProdutoInterface{
    String nome;
    String codigo;
    double preco;
    List<Disciplina> disciplinas;
    List<Livro> livros;

    public Curso(String codigo, String nome) {
        this.nome=nome;
        this.codigo=codigo;
    }

    public Curso(String codigo, String nome, double preco, List<Disciplina> disciplinas, List<Livro> livros) {
        this.nome=nome;
        this.codigo=codigo;
        this.preco=preco;
        this.disciplinas= disciplinas;
        this.livros= livros;
    }

    public Curso(Curso curso) {
        this(curso.codigo, curso.nome, curso.preco, curso.disciplinas, curso.livros);
    }

    public void setLivros(Livro livro){
        livros.add(livro);
    }

    public void setDisciplinas(Disciplina disciplina){
        disciplinas.add(disciplina);
    } 

    public void set(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public double getChTotal(){
        int valor=0;

        for(int x=0; x<=disciplinas.size(); x++){
            valor += disciplinas.get(x).chTotal;
        }
        return valor;
    }

    public double getPctCumprido(){
        int valor=0;

        for(int x=0; x<=disciplinas.size(); x++){
            valor += disciplinas.get(x).pctCumprido;
        }
        return valor;
    }

    public Prototype duplicar(){
        return new Curso(this);
    }

    @Override
    public double getPreco() {
        return preco;
    }

}
