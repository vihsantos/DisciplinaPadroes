public class Circulo implements FiguraInterface{
    private String nome;

    public Circulo (){
        this.nome="Circulo";
    }

    @Override
    public void descricao() {
        System.out.println(this.nome);
    }

}
