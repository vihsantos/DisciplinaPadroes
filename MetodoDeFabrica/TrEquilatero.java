public class TrEquilatero implements FiguraInterface {

    private String nome;

    public TrEquilatero(){
        this.nome="Triangulo Equilatero";
    }
    @Override
    public void descricao() {
        System.out.println(this.nome);
    }

}
