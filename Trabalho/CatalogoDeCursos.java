import java.util.Map;

public class CatalogoDeCursos {
    private static CatalogoDeCursos catalogo;
    private Map<String, Curso> cursos;

    public CatalogoDeCursos getCatalogo(){
        if(CatalogoDeCursos.catalogo == null)
        CatalogoDeCursos.catalogo = new CatalogoDeCursos();
		return CatalogoDeCursos.catalogo; 
    }

    public void inserirCursos(String nome, Curso curso){
        this.cursos.put(nome, curso);
    }

    public Curso getCurso(String nome){
        return this.cursos.get(nome);
    }
}
