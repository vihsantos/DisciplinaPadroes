public class Quadrado implements FiguraInterface {

    private String nome;
    
    public Quadrado(){
        this.nome= "Quadrado";
    }

    @Override
    public void descricao() {
        System.out.println(this.nome);
    }

    
}
