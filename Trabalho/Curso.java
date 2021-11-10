import java.util.List;

public class Curso implements ProdutoInterface{
    List<Disciplina> disciplinas;
    List<Livro> livros;
    String codigo; 
    String nome;
    double preco;

    public Curso(String nome2, String codigo2) {
    }
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }
    public List<Livro> getLivros() {
        return livros;
    }
    public void setLivros(Livro livro) {
        this.livros.add(livro);
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public double getPreco() {
        
        return preco;
    }

    
}
